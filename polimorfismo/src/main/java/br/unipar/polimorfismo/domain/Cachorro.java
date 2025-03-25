/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.domain;

/**
 *
 * @author andersonbosing
 */
public class Cachorro extends Animal {
    
    private Integer qtdPatas;
    
    public Cachorro() {
        super();
    }
    
    public Cachorro(Integer qtdPatas, Integer id, String nome, Double peso) {
        super(id, nome, peso);
        this.qtdPatas = qtdPatas;
    }

    public Integer getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(Integer qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "qtdPatas=" + qtdPatas + '}';
    }
    
    @Override
    public void respirar() {
        System.out.println("Cachorrinho respirando o ar puro da floresta");
    }
}
