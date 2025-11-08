//Crie um algoritmo que pede dois números e uma operação (adição, subtração, multiplicação ou divisão) e retorna o resultado da operação.
//import java.util.ArrayList;
//import java.util.List;
//import static java.lang.StringTemplate.STR;

package faculdade_1semestre.nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1 = null;
        Double n2 = null;
        int n3 = 0;
        String resposta = null;

        System.out.println("Digite 2 numeros, que serao usados em uma operação");
        System.out.print("Numero 1:");
        n1 = sc.nextDouble();
        System.out.print("Numero 2:");
        n2 = sc.nextDouble();
        System.out.println ("""
                Agora me diga: Qual operaçao deseja que seja feita entre estes dois numeros? Digite:
                -1 para adição
                -2 para subtração
                -3 para multiplicação
                -4 para divisao
                !!APENAS SAO ACEITOS NUMEROS!!""");
        n3 = sc.nextInt();

        switch (n3){
            case 1:
                System.out.println(String.format("%.1f + %.1f = %.1f", n1, n2, (n1 + n2)));
                break;
            case 2:
                System.out.println(String.format("%.1f - %.1f = %.1f", n1, n2, (n1 - n2)));
                break;
            case 3:
                System.out.println(String.format("%.1f x %.1f = %.1f", n1, n2, (n1 * n2)));
                break;
            case 4:
                System.out.println(String.format("%.1f / %.1f = %.1f", n1, n2, (n1 / n2)));
                break;
        }
        sc.nextLine();
        System.out.println("Quer testar outro numero? (S / N)");
        resposta = sc.nextLine().toUpperCase();
    }
}