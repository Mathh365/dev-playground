//Escreva um programa que pede três comprimentos e classifica o triângulo equilátero, isósceles ou escaleno.

package nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double medida1 = 0.0, medida2 = 0.0, base = 0.0;

        System.out.print("Digite a medida da base do triangulo aqui: ");
        base = sc.nextDouble();
        System.out.print("Digite a segunda medida do triangulo aqui: ");
        medida1 = sc.nextDouble();
        System.out.print("Digite a terceira medida do triangulo aqui: ");
        medida2 = sc.nextDouble();

        if (((base + medida1) > medida2) && ((base + medida2) > medida1) && ((medida1 + medida2) > base)) {    //CONFIRMA SE É REALMENTE UM TRIANGULO
            if (medida1 == medida2 && medida2 == base){
                System.out.println("É um triangulo equilatero, pois possui todas as medidas iguais");
            } else if (medida1 == medida2 && medida2 != base){
                System.out.println("É um triangulo isoceles, pois a base é diferente dos lados, que sao iguais entre si");
            } else if ((base != medida2) && (base != medida1) && (medida1 != medida2)){
                System.out.println("Então é um triangulo escaleno, pois todos os lados sao diferentes");
            }
        } else {
            System.out.println("Nao é um triangulo");
        }
    }
}
