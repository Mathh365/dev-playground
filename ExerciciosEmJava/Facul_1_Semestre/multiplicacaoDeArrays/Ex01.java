package Facul_1_Semestre.multiplicacaoDeArrays;

public class Ex01 {
    public static void main(String [] args){
        int[] lista1 = {3, 4, 5, 6};
        int[] lista2 = {9, 8, 7, 6};
        int num = 0, soma = 0;

        for (int i = 0; i < lista1.length; i++){
            num = lista1[i] * lista2[i];
            soma = soma + num;
        }
        System.out.println(soma);
    }
}