package SegundoSemestre.Lista02.Classes;
import java.util.Scanner;

public class Matematica {

    public double OperacoesBasicas(double n1, double n2){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
            Escolha uma operação, diigite um numero entre:
            1 - Adição
            2 - Subtração
            3 - Multiplicação
            4 - Divisão""");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                return n1 / n2;
            default:
                break;
        }
        return 0;
    } 

    public double Soma(double n1, double n2){
        return n1 + n2;
    }

    public double Subtracao(double n1, double n2){
        return n1 - n2;
    }

    public double Multiplicacao (double n1, double n2){
        return n1 * n2;
    }

    public double Divisao (double n1, double n2){
        return n1 / n2;
    }

    public boolean IsEven (double num){
        if ((num / 2) == 0) return true; else return false;
    }


    public double Potencia(int potencia, double num){
        double resultado = num;

        for (int i = 1; i < potencia; i++) {
            resultado = resultado * num;
        }

        return resultado;
    }

    public static double radiciacao(double num1, int raiz) {
        return Math.pow(num1, 1.0 / raiz);
    }
}
