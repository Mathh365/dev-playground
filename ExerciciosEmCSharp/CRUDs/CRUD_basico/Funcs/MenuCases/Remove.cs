namespace MenuCases
{
    public static class Remove
    {
        public static void Exec(List<string> lista1)
        {
            Console.Clear();
            
            int item;
            do
            {
                Console.WriteLine("Segue a lista atualizada:\n");
                MyUtil.ExibirLista(lista1);

                Console.Write("\nQual item deseja remover? Digite o numero equivalente ao item, ou digite 0 para encerrar.\n-> ");
                item = Convert.ToInt16(Console.ReadLine());

                if (item != 0)
                {
                    Console.Clear();
                    lista1.Remove(lista1[item - 1]);
                    Console.WriteLine("\nItem removido com sucesso.\n");
                }
            } while (item != 0);

            Console.WriteLine("\nRetornando");
            MyUtil.Loading();
            Console.Clear();
        }
    }
}