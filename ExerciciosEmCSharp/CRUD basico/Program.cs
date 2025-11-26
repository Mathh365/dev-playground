using FuncoesDoMenu;


Console.Clear();
bool isOn = true;
List<string> lista = new List<string>();
Console.WriteLine("Bem vindo ao menu interativo. Aqui voce poderá adicionar, remover, editar, ou listar os itens de sua lista de compras.");

do
{
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
            Listing.Exec(lista);
            break;
        case "2":
            Add.Exec(lista);
            break;
        case "3":
            Remove.Exec(lista);
            break;
        case "4":
            Clear.Exec(lista);
            break;
        case "encerrar":
            Console.Clear();
            Console.WriteLine("Obrigado por usar os serviços MirANet\nEncerrando sistema");
            MyUtil.Loading();
            isOn = !isOn;
            break;
        default:
            Console.Clear();
            Console.WriteLine("Invalido, por favor digite novamente");
            break;
        }
} while (isOn);