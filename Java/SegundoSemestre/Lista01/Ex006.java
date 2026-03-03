//Faça um programa que receba o nome de uma pessoa e seu respetivo sexo. Caso o sexo da pessoa seja “F”, apresente na tela “Ilmo. Sra.” acompanhado do nome da pessoa. Se o sexo informado for “M”, exiba “Ilmo. Sr.” seguido do nome da pessoa. Caso a entrada não corresponda a nenhuma dessas opções, exiba “sexo inválido”.

package SegundoSemestre.Lista01;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine().toLowerCase();
 
        System.out.print("Digite seu sexo: ");
        String sexo = sc.nextLine().toLowerCase();

        switch (sexo) {
            case "f":
            System.out.printf("Ilmo. Sra. %s", nome);
            break;
            case "m":
            System.out.printf("Ilmo. Sr. %s", nome);
            break;
            default:
                break;
        }
    }
}