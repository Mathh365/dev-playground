package SegundoSemestre.Lista02.Classes;

import java.util.Scanner;

public class ConversorMoeda {

    public double ReaisParaDolar(double valor){
        double cotacao = 4.95;
        return valor / cotacao;
    }

    public double ReaisParaLibra(double valor){
        double cotacao = 6.30;
        return valor / cotacao;
    }

    public double ReaisParaFranco(double valor){
        double cotacao = 5.60;
        return valor / cotacao;
    }

    public double ReaisParaIene(double valor){
        double cotacao = 0.033;
        return valor / cotacao;
    }

    public double DolarParaReais(double valor){
        double cotacao = 4.95;
        return valor * cotacao;
    }

    public double LibraParaReais(double valor){
        double cotacao = 6.30;
        return valor * cotacao;
    }

    public double FrancoParaReais(double valor){
        double cotacao = 5.60;
        return valor * cotacao;
    }

    public double IeneParaReais(double valor){
        double cotacao = 0.033;
        return valor * cotacao;
    }

    public void Menu() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        boolean isLoop = true;
        do {

            System.out.println("===== CONVERSOR DE MOEDAS =====");
            System.out.println("1 - Reais -> Dólar");
            System.out.println("2 - Reais -> Libra");
            System.out.println("3 - Reais -> Franco");
            System.out.println("4 - Reais -> Iene");
            System.out.println("5 - Dólar -> Reais");
            System.out.println("6 - Libra -> Reais");
            System.out.println("7 - Franco -> Reais");
            System.out.println("8 - Iene -> Reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            System.out.print("Valor: ");
            double valor = sc.nextDouble();

            double resultado = 0;
            switch (opcao){
                case 0:
                    isLoop = false;
                    break;
                case 1:
                    resultado = ReaisParaDolar(valor);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                case 2:
                    resultado = ReaisParaLibra(valor);
                    System.out.println("Resultado: " + resultado + " GBP");
                    break;

                case 3:
                    resultado = ReaisParaFranco(valor);
                    System.out.println("Resultado: " + resultado + " CHF");
                    break;

                case 4:
                    resultado = ReaisParaIene(valor);
                    System.out.println("Resultado: " + resultado + " JPY");
                    break;

                case 5:
                    resultado = DolarParaReais(valor);
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                case 6:
                    resultado = LibraParaReais(valor);
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                case 7:
                    resultado = FrancoParaReais(valor);
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                case 8:
                    resultado = IeneParaReais(valor);
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while(isLoop);
    }
}