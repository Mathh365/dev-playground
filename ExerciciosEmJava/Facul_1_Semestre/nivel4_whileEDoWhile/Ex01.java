//Faça um algoritmo que pede para o usuário digitar números inteiros positivos.
// O algoritmo deve somar esses números e parar quando o usuário digitar um número negativo.

package Facul_1_Semestre.nivel4_whileEDoWhile;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        System.out.println("Digite um numero INTEIRO POSITIVO");
        numero = sc.nextInt();

        while (numero > 0){
            System.out.printf("%d + %d = %d\n", soma, numero, (soma + numero));
            soma = soma + numero;
            System.out.println("Digite mais um numero, e ele sera sucessivamente somado ao primeiro, digite um negativo para parar");
            numero = sc.nextInt();
        }
    }
}