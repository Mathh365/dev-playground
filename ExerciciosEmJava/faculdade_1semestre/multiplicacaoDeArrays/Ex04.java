//crie 2 vetores a 10 entradas fornecidas pelo usuario e calcule
//o produto escalar desses vetores

package faculdade_1semestre.multiplicacaoDeArrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int num = 0;

        System.out.print("Digite agora 10 numeros\n-");
        for (int i = 0; i < 10; i++){
            lista1[i] = sc.nextInt();
            System.out.println("-" + lista1[i]);
        }
        System.out.print("Digite mais 10 numeros\n-");
        for (int i = 0; i < 10; i++){
            lista2[i] = sc.nextInt();
            System.out.println("-" + lista2[i]);
        }

        for (int i = 0; i < lista1.length; i++){
            num = num + (lista1[i] * lista2[i]);
        }
        System.out.println(num);

        sc.close();
    }
}
