namespace MenuFunctions
{
    public static class Clear
    {
        public static void Exec(List<string> lista)
        {
            Console.Clear();

            Console.Write("Tem certeza que deseja limpar a lista?\n(y/n): ");
            char limpar = Convert.ToChar(Console.ReadLine());

            if (limpar == 'y')
            {
                Console.WriteLine("Limpando sua lista");
                lista.Clear();
                MyUtil.FastLoading();    

                Console.Write("Lista limpa, deseja adicionar novos elementos?\n(y/n): ");
                char opcao = Convert.ToChar(Console.ReadLine());

                if (opcao == 'y')
                {
                    Add.Exec(lista);
                }
                else
                {
                    Console.WriteLine("Retornando");
                    MyUtil.Loading();
                    Console.Clear();
                }
            }
            else
            {
                Console.WriteLine("Retornando para o menu");
                MyUtil.Loading();
                Console.Clear();
            }
        }
    }
}