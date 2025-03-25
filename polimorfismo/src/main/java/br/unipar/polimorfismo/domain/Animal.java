/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.domain;

/**
 *
 * @author andersonbosing
 */
public class Animal {
    
    private Integer id;
    
    private String nome;
    
    private Double peso;

    public Animal() {
    }

    public Animal(Integer id, String nome, Double peso) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", peso=" + peso + '}';
    }
    
    public void respirar() {
        System.out.println("Animal respirando");
    }
    
}
