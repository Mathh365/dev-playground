//Escreva um algoritmo que solicita ao usuário uma senha e continua
//pedindo até que a senha digitada seja correta. (OBS: deixe uma senha
//fixa no código, definida por você)

package faculdade_1semestre.nivel4_whileEDoWhile;
import java.util.Objects;
import java.util.Scanner;

public class Ex04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String senha = "12345", tentativa;
        System.out.print("Tente adivinhar a senha, chute um numero: ");

        while (true){
            System.out.println("Numero: ");
            tentativa = sc.next();

            if (Objects.equals(tentativa, senha)){
                System.out.println("Senha correta, parabens!!");
                break;
            } else {
                System.out.println("Não foi desta vez, tente novamente");
            }
        }
    }
}
