// Escreva um algoritmo que solicite ao usuário que insira 5 números inteiros e
// armazene esses números em um vetor. Em seguida, o programa deve exibir a
// média dos números inseridos.

package Facul_1_Semestre.nivel5_vetores;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] array1 = new double[5];
        double media = 0, soma = 0;
        
        for(int num = 0; num < array1.length; num++){
            System.out.println("Digite um numero.\nNumero:");
            array1[num] = sc.nextDouble();
            soma += array1[num];
        }
        media = soma / array1.length;
        System.out.printf("A media entre os numeros digitados, é: %.2f", media);
    }
}
