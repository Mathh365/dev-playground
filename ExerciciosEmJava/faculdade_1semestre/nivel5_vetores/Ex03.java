// Crie um algoritmo que leia 10 nomes de pessoas e os armazene em um vetor. Em
// seguida, o programa deve exibir esses nomes em ordem inversa, ou seja, do
// último ao primeiro.

package faculdade_1semestre.nivel5_vetores;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array1 = new String[10];

        for (int i = (array1.length - 1); i > 0; i--){
            System.out.print("Digite uma palavra\nPalavra: ");
            array1[i] = sc.nextLine();
        }

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
    }
}
