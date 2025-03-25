/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.calculadora.bonus.domain;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonus {
    
    public void calcular(Colaborador colaborador) {
        if (colaborador instanceof Funcionario) {
            Double bonus = colaborador.getSalario() * 1.10;
            System.out.println("Funcionario vai ganhar: "+bonus+" de bonus");
            return;
        }
        
        if (colaborador instanceof Gerente) {
            Double bonus = colaborador.getSalario() * 1.50;
            System.out.println("Gerente vai ganhar: "+bonus+" de bonus");
            return;
        } 
        
        if (colaborador instanceof Diretor) {
            Double bonus = colaborador.getSalario() * 1.75;
            System.out.println("Diretor vai ganhar: "+bonus+" de bonus");
            return;
        } 
        
    }
    
}
