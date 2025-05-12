/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domain.Animal;
import java.util.List;

/**
 *
 * @author andersonbosing
 */
public interface AnimalRepository {
 
    public Animal insert(Animal Animal);
    public List<Animal> findAll();
    public Animal update(Animal Animal);
    public void delete(Integer id);
    
}