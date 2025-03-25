/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.polimorfismo;

import br.unipar.polimorfismo.domain.Cachorro;
import br.unipar.polimorfismo.domain.Peixe;
import br.unipar.polimorfismo.domain.Respirador;

/**
 *
 * @author andersonbosing
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        Peixe peixe = new Peixe();
        
        Respirador respirador = new Respirador();
        respirador.fazerRespirar(cachorro);
        respirador.fazerRespirar(peixe);
        
        
    }
}
