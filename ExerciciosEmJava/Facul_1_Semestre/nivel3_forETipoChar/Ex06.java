//Soma de Números Pares: Escreva um programa que calcule a soma dos primeiros N números pares. O valor de N é fornecido pelo usuário.

package Facul_1_Semestre.nivel3_forETipoChar;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0, acumulador = 0;

        System.out.println("Digite um valor, e calcularei a soma de todos os numeros pares ate ele");
        num  = sc.nextInt();

        for(int i = 0; i <= num; i++){
            if (i % 2 == 0){
                acumulador = acumulador + i;
            }
        }
        System.out.println(acumulador);
    }
}
