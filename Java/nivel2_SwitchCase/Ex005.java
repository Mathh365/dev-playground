//Elabore um programa que solicita um mês do ano e utiliza switch case para informar eventos especiais que ocorrem nesse mês.

package nivel2_SwitchCase;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mes = 0;

        System.out.println("Digite um mes dp ano EM NUMEROS");
        mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Janeiro: evento X");
                break;
            case 2:
                System.out.println("Fevereiro: Evento Y");
                break;
            case 3:
                System.out.println("Março: Evento Z");
                break;
            default:
                System.out.println("Invalido, digite apenas numeros");
        }
    }
}
