/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3exercicio1;

/**
 *
 * @author LeoUser
 */
public class Aula3Exercicio1 {

    public static void main(String[] args) {
        float valorUm = 1;
        float valorDois = 2;
        float soma = somar(valorUm, valorDois);
        System.out.println("Soma é: " + soma);

    }

    public static float somar(float paramUm, float paramDois) {
        return paramUm + paramDois;
    }
}
