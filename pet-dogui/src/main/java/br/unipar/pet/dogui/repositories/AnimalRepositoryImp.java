/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domain.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


/**
 *
 * @author andersonbosing
 */
public class AnimalRepositoryImp implements AnimalRepository {
    
    private static final String INSERT =
            "insert into animal (dt_insercao, dt_atualizacao, deleted, nome, porte)\n" +
            "values(?, ?, ?, ?, ?);";

    @Override
    public Animal insert(Animal Animal) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
       
        
    
    }

    @Override
    public List<Animal> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Animal update(Animal Animal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
