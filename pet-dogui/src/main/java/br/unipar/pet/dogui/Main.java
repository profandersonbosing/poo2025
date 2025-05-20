/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.pet.dogui;

import br.unipar.pet.dogui.domain.Animal;
import br.unipar.pet.dogui.domain.PorteEnum;
import br.unipar.pet.dogui.services.AnimalService;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        try {
            
//            CREATE TABLE animal (
//                id SERIAL PRIMARY key not null,
//                dt_insercao TIMESTAMP not null,
//                dt_atualizacao TIMESTAMP not null,
//                deleted BOOLEAN default true not null,
//                nome VARCHAR(60) not null,
//                porte VARCHAR(10) not null
//            );

            
            Animal animal = new Animal();
            animal.setNome("Hunter");
            animal.setPorte(PorteEnum.PEQUENO);

            AnimalService animalService = new AnimalService();
            animal = animalService.insert(animal);

            JOptionPane.showMessageDialog(null, animal.toString());
            
            List<Animal> resultado = animalService.findAll();
            JOptionPane.showMessageDialog(null, resultado.toString());

            animal = animalService.findById(1);
            JOptionPane.showMessageDialog(null, animal.toString());

            animal = animalService.update(animal);
            JOptionPane.showMessageDialog(null, animal.toString());

            animalService.delete(1);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.toString());
        }
    }
    
}
