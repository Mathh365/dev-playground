//Faça um algoritmo que solicita um número de 1 a 7 representando um dia da semana e informa o nome do dia correspondente.

package nivel2_SwitchCase;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int semana = 0;

        System.out.println("Digite um numero de 1-7 que ira representar um dia da semana");
        semana = sc.nextInt();

        switch (semana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Sexta-Feira");
                break;
            case 5:
                System.out.println("Sábado");
                break;
            case 6:
                System.out.println("Domingo");
                break;
        };
    }
}
