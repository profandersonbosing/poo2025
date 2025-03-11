/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.agenda;

import br.unipar.agenda.domain.Cidade;
import br.unipar.agenda.domain.Contato;
import br.unipar.agenda.domain.Endereco;
import br.unipar.agenda.domain.Telefone;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Agenda {

    public static void main(String[] args) {
        
        Cidade cidade = new Cidade();
        cidade.setId(1L);
        cidade.setNome("Toledo");
        cidade.setCodIbge("3231312");
        
        Endereco endereco = new Endereco();
        endereco.setId(1L);
        endereco.setNomeRua("Avenida parigot de souza");
        endereco.setCep("85920-000");
        endereco.setNumero(123);
        endereco.setBairro("Centro");
        endereco.setCidade(cidade);
        
        Endereco enderecoComercial = new Endereco();
        enderecoComercial.setId(2L);
        enderecoComercial.setBairro("Vila becker");
        enderecoComercial.setCidade(cidade);
        enderecoComercial.setCep("44234324-324");
        enderecoComercial.setComplemento("Rua sem saida");
        enderecoComercial.setNumero(1444);
        enderecoComercial.setNomeRua("Avenida maripá");
        
        Telefone telefone = new Telefone();
        telefone.setId(1L);
        telefone.setNumero("(45) 999999-9999");
        
        Contato contato = new Contato();
        contato.setId(1L);
        contato.setNome("Professor Anderson");
        contato.getTelefones().add(telefone);
        contato.getEnderecos().add(endereco);
        contato.getEnderecos().add(enderecoComercial);
        
        System.out.println(contato.toString());
        JOptionPane.showMessageDialog(null, contato.toString());
        
    }
}
