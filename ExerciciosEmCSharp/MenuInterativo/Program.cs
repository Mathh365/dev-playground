using FuncoesDoMenu;

Console.Clear();
Console.WriteLine("Bem vindo ao menu interativo.");

do
{
    int opcaoEscolhida = 0;
    Console.Clear();
    
    Console.Write("""
    Seja bem vindo, escolha uma das opçoes a baixo:

    1- Hello World (Apresenta "Hello World" na tela)
    2- Somador (Solicita 2 numeros e apresenta a soma entre eles)
    3- Media ponderada (Calcula uma media ponderada, com sistema de pesos)
    4- Media aritmetica (Calcula uma media aritmetica comum)
    5- 

    Ou digite "0" para encerrar o serviço
    Opção: 
    """);

    opcaoEscolhida = Convert.ToInt16(Console.ReadLine());

    switch (opcaoEscolhida)
    {
        case 1:
            Console.Clear();
            Func01.Exec();
            break;
        case 2:
            Console.Clear();
            Console.Write("Farei a soma de 2 numeros, por gentileza digite os numeros a serem usados.\n'APENAS NUMEROS INTEIROS SAO ACEITOS'");

            Console.Write("\nNumero 1: ");
            int n1 = Convert.ToInt16(Console.ReadLine());
            Console.Write("\nNumero 2: ");
            int n2 = Convert.ToInt16(Console.ReadLine());
            
            Func02.Exec(n1, n2);
            break;
        case 3:
            
            break;
        case 4:
            break;
        case 5:
            break;
    }
} while (true);


