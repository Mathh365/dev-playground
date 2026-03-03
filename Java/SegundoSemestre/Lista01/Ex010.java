//Faça um programa que receba e armazene em um array os nomes de 10 pessoas. O programa deve sortear um ganhador entre os nomes presentes no array e apresentar o ganhador na tela.
package SegundoSemestre.Lista01;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pessoas = new String[3];
        // String[] pessoas = {"Pedro", "Marcelo", "jorge", "robertinho"}; variavel usada durante a criação do codigo, apenas para debug

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite um nome: ");
            pessoas[i] = sc.nextLine();
        }

        int sorteado = (int) (Math.random() * (pessoas.length));
        System.out.println(pessoas[sorteado]);
    }
}