//Desenvolva um algoritmo que informa se uma pessoa é criança,
//adolescente, adulto ou idoso.

package faculdade_1semestre.nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.print("Digite uma idade \n-");
        idade = sc.nextInt();

        if (idade <= 14){
            System.out.println(idade + " É criança");
        } else if (idade > 14 && idade <= 19){
            System.out.println(idade + " É adolescente");
        } else if (idade > 19){
            System.out.println(idade + " É adulto");
        }
    }
}

