// Faça um algoritmo que leia 10 números inteiros e armazene-os em um vetor. Em
// seguida, o programa deve ordenar o vetor em ordem crescente e exibir o
// resultado.

package faculdade_1semestre.nivel5_vetores;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int maior = 0;

        for (int num = 0; num < array1.length; num++){
            System.out.print("Digite um numero\nNumero: ");
            array1[num] = sc.nextInt();

            if (array1[num] > maior) maior = array1[num];
        }
        System.out.printf("O maior numero é %d", maior);
    }
}
