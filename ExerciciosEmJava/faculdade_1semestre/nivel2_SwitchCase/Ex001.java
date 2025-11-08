//Faça um algoritmo onde se saiba se descubra se é a primeira ou a segunda quinzena do mês. Considere meses de 30 dias. Utilize switch case

package faculdade_1semestre.nivel2_SwitchCase;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;

        System.out.println("Digite o dia do mes");
        dia = sc.nextInt();

        if (dia < 15){
            System.out.println("Estamos na primeira quinzena do mes");
        } else {
            System.out.println("Estamos na segunda quinzena do mes");
        }
    }
}