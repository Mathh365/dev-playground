// /Escreva uma classe utilizando métodos para resolver as seguintes situações:

// a) preencher uma matriz A com dimensões 5 x 5;
// b) ordenar os elementos da matriz A;
// c) gerar uma matriz somente com os números pares da matriz A;
// d) gerar uma matriz somente com os números múltiplos de 5;
// e) criar um menu para acessar os itens anteriores.

package SegundoSemestre.Lista02;

import SegundoSemestre.Lista02.Classes.Matrix;

public class Ex005 {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] matriz = {         //                                   matriz pre definida para fins de praticidade na hora dos testes
            {1, 3, 2, 5, 6},
            {4, 3, 5, 6, 10},
            {22, 1, 14, 7, 29},
            {23, 30, 14, 6, 10},
            {11, 7, 39, 2, 9}
        };

        // matriz = m.SolicitarValores(2);                              metodo nao utilizado por questoes de praticidade no desenvolvimento, porem testada e funcionando
        // System.out.println(matriz.getClass().getSimpleName());       linha usada para debug durante o desenvolvimento

        
    }
}