//Desenvolva um programa que pede um ano e determina se ele é bissexto ou não.

package Facul_1_Semestre.nivel1_comparaçõesEoperadoresBasicos;
import java.util.Scanner;

public class Ex06 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int ano = 0;

        System.out.print("Em que ano estamos?");
        ano = sc.nextInt();

        if (ano % 100 == 0){
            if (ano % 400 == 0){
                System.out.println("Este é um ano bissesxto");
            } else {
                System.out.println("Não é bissexto");
            }
        } else if (ano % 4 == 0) {
            System.out.println("Este é um ano bissesxto");
        } else {
            System.out.println(String.format("%s não é bissexto", ano));
        }
    }
}
