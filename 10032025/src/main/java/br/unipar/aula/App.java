package br.unipar.aula;

import br.unipar.aula.domain.Carro;
import br.unipar.aula.domain.Marca;
import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        
        Marca marca = new Marca();
        marca.setId(1L);
        marca.setNome("Tesla");
        
        Carro carro = new Carro();
        carro.setId(1L);
        carro.setApelido("Meu carro");
        carro.setChassi("dsjadajksghdk1312312");
        carro.setMarca(marca);
        
        JOptionPane.showMessageDialog(null, carro.toString());
    }
}
