using System.ComponentModel;

namespace FuncoesDoMenu
{
    public static class Func04
    {
        public static void Exec (int numero)
        {
            for (int i = 1; i < numero; i++)
            {
                Console.WriteLine(i);
            }

            MyUtil.Retorno();
        }
    }
}