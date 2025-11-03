// Crie um algoritmo que leia 5 valores inteiros e os armazene em um
// vetor. Em seguida, o programa deve encontrar e exibir o maior e o
// menor valor presente no vetor.

package nivel5_vetores;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int maior = 0, menor = 0;

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite um numero\nNumero: ");
            array1[i] = sc.nextInt();

            if (array1[i] > maior) maior = array1[i];
        }
        
        menor = maior;

        for (int i = 0; i < array1.length; i++) {
            if (array1[(i)] < menor) menor = array1[(i)];
        }

        System.out.printf("O maior numero é: %d\n E o menor é %d", maior, menor);
    }
}
