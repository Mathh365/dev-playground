// /Escreva um programa que tenha uma função menu() para exibir
// opções e outras funções para executar as ações de cada opção.

package faculdade_1semestre.nivel6_funcoes;
import java.util.Scanner;

public class Ex05
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException
    {
        menu();
    }

    static void menu() throws InterruptedException
    {
        boolean isOn = true;
        do
        {
            System.out.print("""
            Bem vindo ao menu de funçoes, abaixo segue uma lista com as funçoes, escolha uma de sua preferencia

            1- Hello World
            2- Print numeros
            3- Exit

            Opção: """);
            
            switch (sc.nextInt())
            {
                case 1:
                    System.out.println("Hello World");
                    Pausar();
                    break;
                case 2:
                    int limite = 0;
                    System.out.print("Digite um numero, e contarei todos os numeros do 1 ate o seu numero\nNumero: ");
                    limite = sc.nextInt();
                    PrintNumeros(limite);
                    Pausar();
                    break;
                case 3:
                    System.out.println("Encerrando o menu, muito obrigado por usar os serviços MrNET");
                    Loading();
                    isOn = false;
                    break;
                default:
                    System.out.println("Invalido, por favor, insira novamente. Retornando ao menu principal");
                    Loading();
                    break;
            } 
        } while (isOn);
    }

    private static void PrintNumeros (int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }
    }

    private static void Loading () throws InterruptedException
    {
        for (var i = 0; i < 3; i++)
        {
            System.out.print(".");
            Thread.sleep(1000);
        }
    }

    private static void Pausar ()
    {
        System.out.println("\nAperte qualquer tecla para retornar ao menu.");
        sc.next();
    }
    
}
