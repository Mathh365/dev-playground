//Usando a entrada de dados recebe quatro valores decimais, respectivos as notas de cada bimestre.
//Depois de coletadas a quatro notas, realizar operação de soma e médiadas notas, mostrando em tela.

package SegundoSemestre.Lista01;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[4];
        int bimestre = 1;
        for (int i = 0; i < notas.length; i++) {

            do {
                System.out.println("Digite a nota do bimestre " + bimestre);
                notas[i] = sc.nextInt();
                
                if ((notas[i] > 10) || (notas[i] < 0)) System.out.println("Valor invalido, digite um valor entre 0 e 10");
            } while (notas[i] < 0 || notas[i] > 10);

            bimestre++;
            System.out.println(notas[i]);
        }
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.printf("A sua media é " + media);
    }
}
