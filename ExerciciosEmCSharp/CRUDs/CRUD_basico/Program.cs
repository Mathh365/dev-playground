using MenuCases;

Console.Clear();
bool isOn = true;
List<string> shoppingList = new List<string>();
Console.WriteLine("Bem vindo ao menu interativo. Aqui voce poderá adicionar, remover, editar, ou listar os itens de sua lista de compras.");

do
{
    Console.Write("""
    Seja bem vindo, escolha uma das opçoes a baixo:

    1- LISTAR ITENS DA LISTA
    2- ADICIONAR ITENS NA LISTA
    3- REMOVER ITENS DA LISTA
    4- LIMPAR A LISTA
    5- EXPORTAR LISTA EM .txt

    Ou digite "ENCERRAR" para encerrar o serviço
    Opção: 
    """);

    string opcaoEscolhida = Console.ReadLine().ToLower();

    switch (opcaoEscolhida)
    {
        case "1":
            Listing.Exec(shoppingList);
            break;
        case "2":
            Add.Exec(shoppingList);
            break;
        case "3":
            Remove.Exec(shoppingList);
            break;
        case "4":
            Clear.Exec(shoppingList);
            break;
        case "5":
            Save.Exec(shoppingList);
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