//Fatorial Duplo: Escreva um programa que solicite ao usuário um número inteiro positivo N e calcule e exiba o fatorial duplo desse
//número. O fatorial duplo de um número N é dado pela multiplicação de todos os números pares menores ou iguais a N.

package faculdade_1semestre.nivel3_forETipoChar;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fat = 0, resultado = 1, impar = 0;
        fat = sc.nextInt();

        if (fat % 2 == 1){
            for (int i = fat; i > 1; i--){
                if (i % 2 == 1){
                    impar = i;
                    System.out.println(impar);
                    resultado = resultado * impar;
                }
            }
            System.out.println(resultado);
        } else {
            for (int i = fat; i > 1; i--){
                if (i % 2 == 0){
                    impar = i;
                    System.out.println(impar);
                    resultado = resultado * impar;
                }
            }
            System.out.println(resultado);
        }
    }
}
