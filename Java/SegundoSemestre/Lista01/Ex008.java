package SegundoSemestre.Lista01;

//Escreva um programa que recebe dois números inteiros e diferentes. Depois exibir na tela todos os números pares definidos no intervalo dele (utilizar estrutura de repetição).

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um numero inteiro");
        num1 = (int)sc.nextInt();
        int menor = num1;
        int maior = num1;
        
        System.out.println("Digite outro numero inteiro");
        num2 = (int)sc.nextInt();

        if (num2 < menor) menor = num2;
        if (num2 > maior) maior = num2;

        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}