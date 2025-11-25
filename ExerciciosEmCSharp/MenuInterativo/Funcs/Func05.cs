namespace FuncoesDoMenu
{
    public static class Func05
    {
        public static void Exec(List<string> lista1)
        {
            string item;
            while(true)
            {
                Console.Write("\nQual item deseja adicionar a lista?\nDigite 'fim' para encerrar.\nItem: ");
                item = Console.ReadLine().ToLower();
                if (item == "fim") break;

                lista1.Add(item);
                Console.WriteLine($"\n{item} adicionado com sucesso a sua lista.\n");
            }
            Console.WriteLine("Retornando");
            MyUtil.Loading();
        }
    }
}