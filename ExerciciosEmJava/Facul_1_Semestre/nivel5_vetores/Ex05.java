// Escreva um algoritmo que leia quantos números inteiros o usuário quiser
// informar, e os armazene em um vetor. Em seguida, o programa deve exibir a
// soma dos números pares e a soma dos números ímpares.


package Facul_1_Semestre.nivel5_vetores;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0;

        System.out.print("Quantos numeros deseja informar?\n: ");
        int[] array1 = new int[sc.nextInt()];

        System.out.println("Agora digite os numeros");
        for (int i : array1) {
            System.out.print("\nNumero: ");
            array1[i] = sc.nextInt();

            if (array1[i] % 2 == 0) somaPar += array1[i];
            if (array1[i] % 2 == 1) somaImpar += array1[i];
        }

        System.out.printf("A soma de todos os numeros pares digitados é: %d\nE a dos numeros impares é: %d", somaPar, somaImpar);
    }
}
