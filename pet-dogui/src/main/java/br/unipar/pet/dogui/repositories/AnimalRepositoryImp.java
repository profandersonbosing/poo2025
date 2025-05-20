/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domain.Animal;
import br.unipar.pet.dogui.domain.PorteEnum;
import br.unipar.pet.dogui.infraestructure.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author andersonbosing
 */
public class AnimalRepositoryImp implements AnimalRepository {
    
    private static final String INSERT =
            "insert into animal (dt_insercao, dt_atualizacao, "
            + "deleted, nome, porte)\n" +
            "values(?, ?, ?, ?, ?);";
    
    private static final String FIND_ALL =
            "SELECT id, dt_insercao, dt_atualizacao, deleted, "
            + "nome, porte FROM animal ORDER BY id asc";

    private static final String FIND_BY_ID =
            "SELECT id, dt_insercao, dt_atualizacao, deleted, "
            + "nome, porte FROM animal WHERE id = ?";

    private static final String UPDATE =
            "UPDATE animal SET dt_atualizacao = ?, deleted = ?, "
            + "nome = ?, porte = ? WHERE id = ?";

    private static final String DELETE =
            "UPDATE animal SET deleted = ? WHERE id = ?";

    @Override
    public Animal insert(Animal animal) throws SQLException {
    
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            
           conn = new ConnectionFactory().getConnection();
           
           ps = conn.prepareStatement(INSERT, 
                   Statement.RETURN_GENERATED_KEYS);
           
           ps.setDate(1, new java.sql.Date(new Date().getTime()));
           ps.setDate(2, new java.sql.Date(new Date().getTime()));
           ps.setBoolean(3, false);
           ps.setString(4, animal.getNome());
           ps.setString(5, animal.getPorte().toString());
           
           ps.executeUpdate();
           
           rs = ps.getGeneratedKeys();
           
           if (rs.next()) animal.setId(rs.getInt("id"));
            
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
        
        return animal;
    }

    @Override
    public List<Animal> findAll() throws SQLException {
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Animal> animalList = new ArrayList<>();
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            
            ps = conn.prepareStatement(FIND_ALL);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setNome(rs.getString("nome"));
                animal.setPorte(PorteEnum.valueOf(rs.getString("porte")));
                animal.setDeleted(rs.getBoolean("deleted"));
                animal.setDtAtualizacao(rs.getDate("dt_atualizacao"));
                animal.setDtInsercao(rs.getDate("dt_insercao"));
            
                animalList.add(animal);
            }
            
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
        
        return animalList;
    }

    @Override
    public Animal update(Animal animal) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = new ConnectionFactory().getConnection();

            ps = conn.prepareStatement(UPDATE);

            ps.setDate(1, new java.sql.Date(new Date().getTime()));
            ps.setBoolean(2, animal.getDeleted());
            ps.setString(3, animal.getNome());
            ps.setString(4, animal.getPorte().toString());
            ps.setInt(5, animal.getId());

            ps.executeUpdate();

        } finally {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }

        return animal;

    }

    @Override
    public void delete(Integer id) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = new ConnectionFactory().getConnection();

            ps = conn.prepareStatement(DELETE);

            ps.setBoolean(1, true);
            ps.setInt(2, id);

            ps.executeUpdate();

        } finally {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
    }

    @Override
    public Animal findById(Integer id) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Animal animal = null;

        try {

            conn = new ConnectionFactory().getConnection();

            ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setNome(rs.getString("nome"));
                animal.setPorte(PorteEnum.valueOf(rs.getString("porte")));
                animal.setDeleted(rs.getBoolean("deleted"));
                animal.setDtAtualizacao(rs.getDate("dt_atualizacao"));
                animal.setDtInsercao(rs.getDate("dt_insercao"));
            }

        } finally  {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }

        return animal;
    }
}
