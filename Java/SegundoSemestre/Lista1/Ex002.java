//Usando as estruturas de Decisão, construa um programa que tenha o seguinte comportamento:
//Ao digitar o número 1 o programa irá mostrar “Domingo”. Faça isso para todos os dias da semana.
//Tenha em mente que terá o seguinte comportamento
//        1 -> Domingo
//        2 -> Segunda
//        3 -> Terça
//        4 -> Quarta
//        5 -> Quinta
//        6 -> Sexta
//        7 -> Sábado
//        Se o usuário digitar um dia inexistente mostra uma mensagem “Dia Inválido”.

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");    
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
