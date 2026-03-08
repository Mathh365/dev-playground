package SegundoSemestre.Lista02.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    public int[][] PreencherMatriz(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual será o tamanho da matriz?");
        int size = sc.nextInt();
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

    public int[][] ordenarMatriz(int[][] matriz) {

        ArrayList<Integer> lista = new ArrayList<>();

        // 1 - extrair os números da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                lista.add(matriz[i][j]);
            }
        }

        // 2 - ordenar
        lista.sort(null);

        // 3 - devolver para a matriz
        int indice = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lista.get(indice);
                indice++;
            }
        }
        return matriz;
    }

    public void ExibirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print((matriz[i][j]) + ", ");
            }
            System.out.println("\n");
        }
    }

    public int[][] pares(int[][] matriz){

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] novaMatriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] % 2 == 0) novaMatriz[i][j] = matriz[i][j];
            }
        }

        return novaMatriz;
    }

    public int[][] MultiplosDeCinco(int[][] matriz){

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] novaMatriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] % 5 == 0) novaMatriz[i][j] = matriz[i][j];
            }
        }

        return novaMatriz;
    }

    public void Delay() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(450);
        }
        System.out.println("\n");
    }
}
