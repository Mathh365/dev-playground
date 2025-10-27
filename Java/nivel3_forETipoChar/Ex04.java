//Contagem de Vogais e Consoantes: Faça um algoritmo que conte o número de vogais e consoantes em uma frase inserida pelo usuário. Ignore espaços em branco e pontuação. Abaixo algumas coisas que podem precisar:
//char caractere = frase.charAt(i); (Recupera o caracter de uma string pela posição dela na string)
//caractere >= 'a' && caractere <= ‘z’ (essa condição é válida para verificar se um caractere é uma letra.

package nivel3_forETipoChar;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = null;
        int acumuladorVogais = 0, acumuladorConsoantes = 0;
        char letra = 0;

        System.out.println("Digite uma frase");
        frase = sc.nextLine().toLowerCase();

        for (int caractere = frase.length(); caractere > 0; caractere--){
            letra = frase.charAt(caractere - 1);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
                acumuladorVogais ++;
            } else if (letra != ' '){
                acumuladorConsoantes ++;
            }
        }

        System.out.printf("""
                A frase possui:
                %d vogais.
                %d consoantes.
                """, acumuladorVogais, acumuladorConsoantes);
    }
}
