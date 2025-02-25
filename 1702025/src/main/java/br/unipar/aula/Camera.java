/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula;

/**
 *
 * @author andersonbosing
 */
public class Camera {
    
    String marca;
    
    String modelo;
    
    int megapixels;
    
    double peso;
    
    double armazenamento;
    
    boolean stFlash;
    
    String tamanho;
    
    public void ligarFlash() {
        stFlash = true;
    }
    
    public void desligarFlash() {
        stFlash = false;
    }
    
    public void tirarFoto() {
        System.out.println("Camera "+modelo+
                " tirou foto com o flash:"+stFlash
        );
    }
    
}
