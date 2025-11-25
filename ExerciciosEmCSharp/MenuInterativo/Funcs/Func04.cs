namespace FuncoesDoMenu
{
    public static class Func04
    {
        public static void Exec (List<string> lista)
        {
            int numero = 0;
            Console.WriteLine("Segue todos os elementos da sua lista de compras\n");

            if (lista.Count == 0)
            {
                Console.WriteLine("Tem nada aqui paizao, bota alguma coisa na lista");
            }
            else
            {
                foreach(string i in lista)
                {
                    Thread.Sleep(1);
                    numero++;
                    Console.WriteLine($"Elemento numero {numero}: {i}");
                }
            }
            MyUtil.ReturnToMenu();
        }
    }
}