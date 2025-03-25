/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.domain;

/**
 *
 * @author andersonbosing
 */
public class Respirador {
    
    public void fazerRespirar(Animal animal) {
        animal.respirar();
        
        if (animal instanceof Peixe) {
            System.out.println("Objeto é um peixe");
        }
        
        if (animal instanceof Cachorro) {
            System.out.println("Objeto é um cachorro");
        }
    }
    
}
