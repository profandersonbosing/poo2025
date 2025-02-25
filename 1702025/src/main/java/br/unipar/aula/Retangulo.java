/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula;

/**
 *
 * @author andersonbosing
 */
public class Retangulo {
    
    double comprimento;
    
    double largura;
    
    double area;
    
    double perimetro;
    
    public void calcularArea() {
        area = comprimento * largura;
    }
    
    public void calcularPerimetro() {
        perimetro = 2 * (comprimento + largura);
    }
    
    public void imprimir() {
        System.out.println("Meu retangulo tem a area de "+
                area+" e perimetro de "+perimetro);
    }
    
}
