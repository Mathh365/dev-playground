//numeros primos entre 2 e 15 e b = entre multiplos entre
//3 e 20. Qual o produto de escala a.b

package Facul_1_Semestre.multiplicacaoDeArrays;

public class Ex03 {
    public static void main(String[] args){
        int[] listaA = {2, 3, 5, 7, 11, 15};
        int[] listaB = {3, 6, 9, 12, 15, 18};
        int soma = 0, mult;

        for (int i = 0; i < listaA.length; i++){
            mult = listaA[i] * listaB[i];
            soma = soma + mult;
        }
        System.out.println(soma);
    }
}
