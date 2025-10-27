//Escreva um algoritmo que recebe um número e informa se é positivo, negativo ou zero.

package nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um numero e te direi se ele é positivo, negativo, ou igual a 0");
        num = sc.nextInt();

        if (num < 0){
            System.out.println(num + " É negativo");
        } else if (num > 0){
            System.out.println(num + " É positivo");
        } else if (num == 0){
            System.out.println(num + " É igual a zero");
        }
    }
}
