/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domain.Animal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author andersonbosing
 */
public interface AnimalRepository {
 
    public Animal insert(Animal animal) throws SQLException;
    public List<Animal> findAll() throws SQLException;
    public Animal update(Animal animal) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public Animal findById(Integer id) throws SQLException;
    
}