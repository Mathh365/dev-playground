namespace FuncoesDoMenu
{
    public static class Func02
    {
        public static void Exec(List<string> lista1)
        {
            string item = null;
            do
            {
                Console.Write("Qual item deseja adicionar a lista?\nDigite 'fim' para encerrar.\nItem: ");
                item = Console.ReadLine().ToLower();

                if (item != "fim")
                {
                    Console.Clear();
                    lista1.Add(item);
                    Console.WriteLine($"{item} adicionado com sucesso a sua lista.\n");
                }
            } while (item != "fim");

            Console.Write("\nRetornando");
            MyUtil.Loading();
        }
    }
}
