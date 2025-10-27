//Fatorial: Faça um programa que calcule e imprima o fatorial de um
//número fornecido pelo usuário.

package nivel3_forETipoChar;
import java.util.Scanner;

public class Ex01 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int fat = 0, resultado = 0;

        System.out.println("Digite um numero, e receberá o fatorial dele");
        fat = sc.nextInt();
        resultado = fat;

        for (int i = fat;i > 1; i--){
            System.out.println(resultado);
            resultado = resultado * (i - 1);
        }
        System.out.printf("\nO fatorial de %d é %d\n", fat, resultado);

    }
}
