//Crie um algoritmo que diga qual é o maior de dois números.

package nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.print("Digite um numero \n-");
        num1 = sc.nextInt();
        System.out.print("Digite outro numero \n-");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior");
        } else if (num2 > num1){
            System.out.println(num2 + " é maior");
        } else {
            System.out.println("Ambos sao iguais");
        }

    }
}
