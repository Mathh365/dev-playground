//Escreva um algoritmo que pede para o usuário digitar números até
//que a soma desses números seja maior que 100

package Facul_1_Semestre.nivel4_whileEDoWhile;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        System.out.print("Digite numeros, ate que a soma entre eles seja maior que 100\nNumero: ");
        numero = sc.nextInt();

        while (soma < 100){
            soma += numero;
            System.out.print("Proximo numero: ");
            numero = sc.nextInt();
        }
        soma += numero;
        System.out.printf("Resultado final da soma: %d", soma);
    }
}
