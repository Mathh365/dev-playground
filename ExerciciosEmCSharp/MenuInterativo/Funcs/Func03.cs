using System.ComponentModel;

namespace FuncoesDoMenu
{
    public static class Func03
    {
        public static void Exec (int numero)
        {
            for (int i = 1; i < numero + 1; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(1);
            }

            MyUtil.ReturnToMenu();
        }
    }
}