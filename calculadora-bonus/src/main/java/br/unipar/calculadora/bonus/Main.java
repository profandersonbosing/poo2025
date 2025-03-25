/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.calculadora.bonus;

import br.unipar.calculadora.bonus.domain.CalculadoraBonus;
import br.unipar.calculadora.bonus.domain.Diretor;
import br.unipar.calculadora.bonus.domain.Funcionario;
import br.unipar.calculadora.bonus.domain.Gerente;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1500.0);
        
        Gerente gerente = new Gerente();
        gerente.setSalario(20000.0);
        
        Diretor diretor = new Diretor();
        diretor.setSalario(50000.0);
        
        CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
        calculadoraBonus.calcular(funcionario);
        calculadoraBonus.calcular(gerente);
        calculadoraBonus.calcular(diretor);
        
    }
}
