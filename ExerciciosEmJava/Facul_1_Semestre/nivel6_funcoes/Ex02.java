// Crie uma função que receba o nome e a idade de uma pessoa e exiba
// uma mensagem:
// "Olá, <nome>, você tem <idade> anos."

package Facul_1_Semestre.nivel6_funcoes;

public class Ex02 {
    public static void main(String[] args) {
        Saudacao("Matheus", 24);
    }

    static void Saudacao(String nome, int idade){
        System.out.printf("Ola %s, sua idade é %d", nome, idade);
    }
}
