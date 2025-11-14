// /Escreva um programa que tenha uma função menu() para exibir
// opções e outras funções para executar as ações de cada opção.


Ex05.menu();


public static class Ex05
{
    public static void menu ()
    {
        bool isOn = true;
        do
        {
            Console.Clear();
            Console.Write("""
            Bem vindo ao menu de funçoes, abaixo segue uma lista com as funçoes, escolha uma de sua preferencia

            1- Hello World
            2- Print numeros
            3- Exit

            Opção: 
            """);

            switch (int.Parse(Console.ReadLine()))
            {
                case 1:
                    Console.Clear();
                    Console.WriteLine("Hello World");
                    Pausar();
                    break;
                case 2:
                    Console.Clear();
                    int limite = 0;
                    Console.Write("Digite um numero, e contarei todos os numeros do 1 ate o seu numero\nNumero: ");
                    limite = int.Parse(Console.ReadLine());
                    PrintNumeros(limite);
                    Pausar();
                    break;
                case 3:
                    Console.Clear();
                    Console.WriteLine("Encerrando o menu, muito obrigado por usar os serviços MrNET");
                    Loading();
                    
                    isOn = false;
                    break;
                default:
                    Console.WriteLine("Invalido, por favor, insira novamente. Retornando ao menu principal");
                    Loading();
                    break;
            } 
        } while (isOn);
    }

    private static void PrintNumeros (int num)
    {
        for (int i = 1; i <= num; i++)
        {
            Console.WriteLine(i);
        }
    }

    private static void Loading ()
    {
        Console.Write(".");
        Thread.Sleep(1000);
        Console.Write(".");
        Thread.Sleep(1000);
        Console.Write(".");
        Thread.Sleep(1000);
    }

    private static void Pausar ()
    {
        Console.WriteLine("Aperte qualquer tecla para retornar ao menu.");
        Console.ReadKey();
    }
}