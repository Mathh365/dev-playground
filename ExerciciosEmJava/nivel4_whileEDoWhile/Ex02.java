//Faça um algoritmo que peça para o usuário digitar vários números e
//calcule a média desses números. O algoritmo deve parar quando o
//usuário digitar zero.

package nivel4_whileEDoWhile;
import java.util.Scanner;

public class Ex02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0, acumuladorMedia = 0, media;

        System.out.println("Digite numeros sucessivos, e quando digitar 0, sera tirada uma media de todos os anteriores");
        System.out.print("Numero: ");
        numero = sc.nextInt();

        while (numero > 0) {
            acumuladorMedia ++;
            soma += numero;
            System.out.print("Numero: ");
            numero = sc.nextInt();
        }
        media = soma / acumuladorMedia;
        System.out.println(media + " É a sua média");
    }
}
