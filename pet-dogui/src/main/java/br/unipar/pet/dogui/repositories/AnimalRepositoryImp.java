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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   

}
