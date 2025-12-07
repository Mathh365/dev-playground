namespace MenuFunctions
{
    public static class Listing
    {
        public static void Exec (List<string> lista)
        {
            Console.Clear();
            
            Console.WriteLine("Segue todos os elementos da sua lista de compras\n");

            if (lista.Count == 0)
            {
                Console.Write("Vazio, deseja adicionar itens?\n(y/n): ");
                char opcao = Convert.ToChar(Console.ReadLine().ToLower());
                if (opcao == 'y') Add.Exec(lista);
                else 
                {
                    MyUtil.Loading();
                    Console.Clear();
                }
            }
            else
            {
                MyUtil.ExibirLista(lista);
                MyUtil.ReturnToMenu();
                Console.Clear();
            }
        }
    }
}