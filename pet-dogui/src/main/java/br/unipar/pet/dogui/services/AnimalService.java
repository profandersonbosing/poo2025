/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.services;

import br.unipar.pet.dogui.domain.Animal;
import br.unipar.pet.dogui.exceptions.BusinessException;
import br.unipar.pet.dogui.repositories.AnimalRepositoryImp;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author andersonbosing
 */
public class AnimalService {
    
    private AnimalRepositoryImp animalRepository;
    
    public AnimalService(){
        this.animalRepository = new AnimalRepositoryImp();
    }
    
    public Animal insert(Animal animal) throws BusinessException, 
            SQLException {
        
        if (animal == null) throw new BusinessException("Informe os Dados do Animal");
        if (animal.getNome() == null) throw new BusinessException("Informe o Nome do Animal");
        if (animal.getNome().trim().isEmpty()) throw new BusinessException("Informe o Nome do Animal");
        if (animal.getNome().length() < 3) throw new BusinessException("O Nome deve ter no minimo 3 caracteres.");
        if (animal.getNome().length() > 60) throw new BusinessException("O Nome não deve possuir mais do que 60 caracteres");
        
        animal = (Animal) animalRepository.insert(animal);
        
        return animal;
    }
    
    public List<Animal> findAll() throws SQLException {
        return animalRepository.findAll();
    }
    
}