//Faça um programa que receba um número e informe se ele é ímpar ou par.

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
}