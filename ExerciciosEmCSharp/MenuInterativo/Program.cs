using FuncoesDoMenu;

Console.Clear();
bool isOn = true;
Console.WriteLine("Bem vindo ao menu interativo.");

do
{
    Console.Clear();
    
    Console.Write("""
    Seja bem vindo, escolha uma das opçoes a baixo:

    1- Hello World (Apresenta "Hello World" na tela)
    2- Somador (Solicita 2 numeros e apresenta a soma entre eles)
    3- Contador (Conta de 0 ate o numero que voce escolher)
    4- (NÃO IMPLEMENTADO AINDA)
    5- (NÃO IMPLEMENTADO AINDA)

    Ou digite "0" para encerrar o serviço
    Opção: 
    """);

    int opcaoEscolhida = Convert.ToInt16(Console.ReadLine());

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
            Console.Clear();
            Console.Write("Irei contar ate o numero escolhido por voce, por favor digite um numero\nNumero: ");
            Func03.Exec(Convert.ToInt16(Console.ReadLine()));
            break;
        case 4:
            Console.Clear();
            MyUtil.NaoImplementado();
            break;
        case 5:
            Console.Clear();
            MyUtil.NaoImplementado();
            break;


        case 0:
            Console.Clear();
            Console.WriteLine("Obrigado por usar os serviços MirANet\nEncerrando sistema");
            MyUtil.Loading();
            isOn = !isOn;
            break;
        }
} while (isOn);