//Crie um programa que receba notas de listas e provas correspondentes aos critérios de avaliação de POO e exiba a média final do aluno. Cada critério de avaliação deve ser tratado por um método distinto.

package SegundoSemestre.Lista02;

import java.util.Scanner;

import SegundoSemestre.Lista02.Classes.MediaFinal;

public class Ex009 {
    public static void main(String[] args) {
        MediaFinal m = new MediaFinal();
        
        double nota = m.ExecutorDaPipeline(10, 6, 9, 8, 9, 6, 4, 7, 7, 8);
        System.out.printf("%.2f\n", nota);
    }
}
 