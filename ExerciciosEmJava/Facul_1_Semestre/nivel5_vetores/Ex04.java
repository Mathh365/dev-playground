// Faça um algoritmo que solicite ao usuário que digite a altura de 5 pessoas.
// Armazene essas alturas em um vetor e, em seguida, exiba a altura média.

package Facul_1_Semestre.nivel5_vetores;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] array1 = new double[5];
        double alturaMedia = 0, alturaAtual = 0;

        for (int i = 0; i < array1.length; i++){
            System.out.print("Digite uma altura\n: ");
            array1[i] = sc.nextDouble();
            alturaAtual += array1[i];
        }
        alturaMedia = alturaAtual / array1.length;
        System.out.printf("A altura media é %.1f", alturaMedia);
    }
}
