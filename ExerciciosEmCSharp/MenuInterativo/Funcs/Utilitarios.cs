namespace FuncoesDoMenu
{
    public static class MyUtil
    {
        public static void Loading()
        {
            for (int i = 0; i < 3; i++)
            {
                Console.Write(".");
                Thread.Sleep(900);
            }
            Console.WriteLine();
        }

        public static void Retorno()
        {
            Console.WriteLine("Pressione qualquer tecla para retornar ao menu");
            Console.ReadKey();
            Console.WriteLine();
            Loading();
        }
        public static void NaoImplementado ()
        {
            Console.WriteLine("AINDA NAO IMPLEMENTADO, RETORNANDO AO MENU PRINCIPAL");
            Loading();
        }
    }
}