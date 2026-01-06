//Dos exercícios com FOR, para fazer com while agora: Crie um
//algoritmo que solicite um número e calcule o fatorial desse número.

package Facul_1_Semestre.nivel4_whileEDoWhile;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fat, acumulador, resultado = 0;

        System.out.println("Digite um numero inteiro positivo, e te direi o fatorial dele");
        fat = sc.nextInt();
        acumulador = fat;
        resultado = fat;

        while (acumulador > 1){
            resultado = resultado * (acumulador - 1);
            acumulador--;
        }
        System.out.println(resultado);
    }
}
