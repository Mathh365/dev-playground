namespace FuncoesDoMenu
{
    public static class Listing
    {
        public static void Exec (List<string> lista)
        {
            Console.Clear();
            
            Console.WriteLine("Segue todos os elementos da sua lista de compras\n");

            if (lista.Count == 0)
            {
                Console.Write("Vazio, deseja adicionar itens?\n(S/N)");
            }
            else
            {
                MyUtil.ExibirLista(lista);
            }
            MyUtil.ReturnToMenu();
            Console.Clear();
        }
    }
}