namespace FuncoesDoMenu
{
    public static class MyUtil
    {
        public static void Loading(int delay = 750)
        {
            Console.WriteLine();
            for (int i = 0; i < 3; i++)
            {
                Console.Write(".");
                Thread.Sleep(delay);
            }
        }

        public static void FastLoading (int delay = 300)
        {
            Console.Clear();
            
            for (int i = 0; i < 3; i++){
                Console.Clear();
                for (int i2 = 0; i2 < 3; i2++)
                {
                    Console.Write(".");
                    Thread.Sleep(delay);
                }
            }
            Console.WriteLine();
        }

        public static void ReturnToMenu()
        {
            Console.WriteLine("\nPressione qualquer tecla para retornar ao menu");
            Console.ReadKey();
            // Loading(350);
        }
        public static void NaoImplementado ()
        {
            Console.WriteLine("AINDA NAO IMPLEMENTADO, RETORNANDO AO MENU PRINCIPAL");
            Loading(350);
        }
    }
}