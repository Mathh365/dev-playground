//qual o produto escalar de a e b

package faculdade_1semestre.multiplicacaoDeArrays;

public class Ex02 {
    public static void main(String[] args){
        int[] listaA = {-2, 0, 8, 1, 5};
        int[] listaB = {1, 3, -7, 0, 2};
        int mult, soma = 0;

        for (int i = 0; i < listaA.length; i++){
            mult = listaA[i] * listaB[i];
            soma = soma + mult;
        }
        System.out.println(soma);
    }
}
