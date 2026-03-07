package SegundoSemestre.Lista02.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    public int[][] SolicitarValores(int size){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[size][size];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\nNumero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return matriz;
    }

    public void OrdernarMatriz(int[][] matriz){
        ArrayList<Integer> arrayPrincipal = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                arrayPrincipal.add(matriz[i][j]);
            }
        }

        arrayPrincipal.sort(null);

        int linha = 0;
        for (int i = 0; i < arrayPrincipal.size(); i++) {
            if ((i % 5) == 0) linha++;
            matriz[linha][i] = arrayPrincipal[i];
        }
    }
}
