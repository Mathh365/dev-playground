using FuncoesDoMenu;


Console.Clear();
bool isOn = true;
List<string> lista = new List<string>();
Console.WriteLine("Bem vindo ao menu interativo. Aqui voce poderá executar algumas funçoes do nosso sistema, bem como interagir com uma lista de compras que esta integrada ao app, qualquer duvida basta entrarar em contato com o suporte");

do
{
    Console.Clear();
    
    Console.Write("""
    Seja bem vindo, escolha uma das opçoes a baixo:

    1- LISTAR ITENS DA LISTA
    2- ADICIONAR ITENS NA LISTA
    3- REMOVER ITENS DA LISTA
    4- LIMPAR A LISTA
   
    Ou digite "ENCERRAR" para encerrar o serviço
    Opção: 
    """);

    string opcaoEscolhida = Console.ReadLine().ToLower();

    switch (opcaoEscolhida)
    {
        case "1":
            Console.Clear();
            Func01.Exec(lista);
            break;
        case "2":
            Console.Clear();
            Func02.Exec(lista);
            break;
        case "3":
            Console.Clear();
            Func03.Exec(lista);
            break;
        case "4":
            Console.Clear();
            Func04.Exec(lista);
            break;
        case "encerrar":
            Console.Clear();
            Console.WriteLine("Obrigado por usar os serviços MirANet\nEncerrando sistema");
            MyUtil.Loading();
            isOn = !isOn;
            break;
        default:
            Console.WriteLine("Invalido, por favor digite novamente");
            break;
        }
} while (isOn);