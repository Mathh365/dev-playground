// /Escreva um algoritmo que receba a idade de 3 pessoas. O algoritmo deve verificar se cada indivíduo é maior de idade e calcular a média de idade somente das pessoas que têm idade igual ou superior a 18 anos. E como saída exibir na tela média das idade dos maiores de 18 anos.

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, maiorDeIdade = 0, soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a idade " + (i + 1));
            idade = sc.nextInt();

            if (idade >= 18){
                soma += idade;
                maiorDeIdade ++;
            }
        }

        System.out.printf("A media entre as idades dos maiores de 18 anos é %d", (soma / maiorDeIdade));
    }
}