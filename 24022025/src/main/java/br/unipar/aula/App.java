package br.unipar.aula;

import br.unipar.aula.domain.Cachorro;

/**
 *
 * @author andersonbosing
 */
public class App {

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        c.setNome("Hunter");
        
        System.out.println("O nome do cachorro é "+c.getNome());
        
    }
}
