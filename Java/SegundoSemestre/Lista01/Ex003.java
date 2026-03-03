//Faça um programa que lê dois números e responda se o primeiro é o maior

// public class Ex003 {
    //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
        
        //         int num1, num2;
        //         num1 = sc.nextInt();
        //         num2 = sc.nextInt();
        
        //         if (num1 > num2){
            //             System.out.printf("%n é maior", num1);
            //         } else {
                //             System.out.printf("%n é maior", num2);
                //         }
                //     }
                // }


package SegundoSemestre.Lista01;
import java.util.Scanner;


public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        int maior = 0;

        System.out.printf("Digite %d numeros", num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.print("\nNumero: ");
            num[i] = sc.nextInt();

            if (num[i] > maior) maior = num[i];
        }

        System.out.println(maior + " É o maior numero");
    }
}