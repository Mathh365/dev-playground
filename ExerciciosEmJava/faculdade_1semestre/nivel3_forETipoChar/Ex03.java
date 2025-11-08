//Contagem Regressiva de Letras: Faça um programa que solicite ao usuário uma letra e imprima uma contagem regressiva, começando pela letra fornecida e indo até a letra 'A'.

package faculdade_1semestre.nivel3_forETipoChar;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letra = 0;

        System.out.println("Digite uma letra");
        letra = sc.nextLine().charAt(0);

        for (char i = letra; i >= 'a'; i--){
            System.out.println(letra);
            letra--;
        }
    }
}
