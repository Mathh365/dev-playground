// /Escreva uma classe utilizando métodos para resolver as seguintes situações:

// a) preencher uma matriz A com dimensões 5 x 5;
// b) ordenar os elementos da matriz A;
// c) gerar uma matriz somente com os números pares da matriz A;
// d) gerar uma matriz somente com os números múltiplos de 5;
// e) criar um menu para acessar os itens anteriores.

package SegundoSemestre.Lista02;
import java.util.Scanner;
import SegundoSemestre.Lista02.Classes.Matrix;

public class Ex005 {
    public static void main(String[] args) throws InterruptedException {

        Matrix m = new Matrix();
        Scanner sc = new Scanner(System.in);
        // int[][] matriz = new int[5][5];
        int[][] matriz = {         //                                   matriz pre definida para fins de praticidade na hora dos testes
            {1, 3, 2, 5, 6},
            {4, 3, 5, 6, 10},
            {22, 1, 14, 7, 29},
            {23, 30, 14, 6, 10},
            {11, 7, 39, 2, 9}
        };

        // matriz = m.PreencherMatriz(2);                              metodo nao utilizado por questoes de praticidade no desenvolvimento, porem testada e funcionando
        // System.out.println(matriz.getClass().getSimpleName());       linha usada para debug durante o desenvolvimento
        // matriz = m.ordenarMatriz(matrixDeTeste);
        // m.ExibirMatriz(matriz);
        // int[][] novaMatriz = m.MultiplosDeCinco(matrixDeTeste);
        // m.ExibirMatriz(novaMatriz);
        
        
        boolean loop = true;
        do {
            System.out.println("Escolha uma das opçoes abaixo: ");
            System.out.print("""
                    1 - Preencher uma matriz
                    2 - Ordenar elementos da matriz
                    3 - Gerar uma nova matriz apenas com os elementos pares da matriz principal
                    4 - Gerar uma nova matriz apenas com os elementos multiplos de 5 da matriz principal
                    0 - Sair
                """);

                    int opcao = sc.nextInt();

                    switch (opcao) {
                        case 0:
                            System.out.print("Encerrando\nObrigado por usar nossos serviços");
                            m.Delay();
                            loop = false;
                            break;
                        case 1:
                            matriz = m.PreencherMatriz();
                            System.out.println("Processando");
                            m.Delay();
                            break;
                        case 2:
                            matriz = m.ordenarMatriz(matriz);
                            System.out.println("Ordenando");
                            m.Delay();
                            m.ExibirMatriz(matriz);
                            break;
                        case 3:
                            int[][] novaMatrizPares = m.pares(matriz);
                            System.out.println("Criando nova matriz");
                            m.Delay();
                            System.out.println("Copiando apenas os numeros pares");
                            m.Delay();
                            m.ExibirMatriz(novaMatrizPares);
                            break;
                        case 4:
                            int[][] novaMatrizMultiplosDe5 = m.MultiplosDeCinco(matriz);
                            System.out.println("Criando nova matriz");
                            m.Delay();
                            System.out.println("Copiando apenas os multiplos de 5");
                            m.Delay();
                            m.ExibirMatriz(novaMatrizMultiplosDe5);
                            break;
                    }
        } while (loop);
    }
}