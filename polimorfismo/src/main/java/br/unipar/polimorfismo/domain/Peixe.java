/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.domain;

/**
 *
 * @author andersonbosing
 */
public class Peixe extends Animal {
    
    private Integer qtdNadadeiras;
    
    public Peixe() {
        super();
    }
    
    public Peixe(Integer qtdNadadeiras, Integer id, String nome, Double peso) {
        super(id, nome, peso);
        this.qtdNadadeiras = qtdNadadeiras;
    }

    public Integer getQtdNadadeiras() {
        return qtdNadadeiras;
    }

    public void setQtdNadadeiras(Integer qtdNadadeiras) {
        this.qtdNadadeiras = qtdNadadeiras;
    }

    @Override
    public String toString() {
        return "Peixe{" + "qtdNadadeiras=" + qtdNadadeiras + '}';
    }
    
    @Override
    public void respirar() {
        System.out.println("Peixe respirando no fundo do oceano");
    }
    
}
