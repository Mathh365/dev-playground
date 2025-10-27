//Crie um programa que apresenta um menu com operações matemáticas (adição,subtração, multiplicação, divisão) e utiliza switch case para executar a operação escolhida pelo usuário.

package nivel2_SwitchCase;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String operacao = null;
        double num1, num2;

        System.out.printf("""
                          Digite qual operação deseja, entre:
                          Soma: +
                          Subtração: -
                          Divisão: /
                          Multiplicação: *
                          """);
        operacao = sc.nextLine();
        System.out.println("Agora digite dois numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        switch (operacao){
            case "+":
                System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, (num1 + num2));
                break;
            case "-":
                System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, (num1 - num2));
                break;
            case "/":
                System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, (num1 / num2));
                break;
            case "*":
                System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, (num1 * num2));
                break;
            default:
                System.out.println("Operação invalida");
                break;
        };
    }
}
