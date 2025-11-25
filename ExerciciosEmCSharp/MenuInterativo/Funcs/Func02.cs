namespace FuncoesDoMenu
{
    public static class Func02
    {
        public static void Exec (int n1, int n2)
        {
            Console.WriteLine("Processando");
            MyUtil.Loading();
            Console.WriteLine($"{n1} + {n2} = {n1 + n2}");
            MyUtil.ReturnToMenu();
        }
    }
}