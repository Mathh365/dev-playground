// Escreva um algoritmo que leia 5 números inteiros e os armazene em
// um vetor. Depois, o programa deve verificar se um número fornecido
// pelo usuário está presente no vetor e, se estiver, exibir em qual
// posição ele está.


package nivel5_vetores;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int numeroABuscar = 0, index = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Digite um numero e buscarei ele na lista\nNumero: ");
        numeroABuscar = sc.nextInt();

        for (int i = 0; i < array1.length; i++) {
            index++;
            if (array1[i] == numeroABuscar) System.out.printf("\nNumero: %d\nÍndice: %d" , numeroABuscar, (index-1));
        }
    }
}
