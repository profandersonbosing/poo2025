/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.domain;


/**
 *
 * @author andersonbosing
 */
public enum PorteEnum {
    
    MINI("Miniatura", "M"),
    PEQUENO("Pequeno", "P"),
    MEDIO("Médio", "MD"),
    GRANDE("Grande", "G");
    
    private String descricao;
    private String sigla;

    private PorteEnum(String descricao, String sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSigla() {
        return sigla;
    }
}