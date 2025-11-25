namespace FuncoesDoMenu
{
    public static class Func04
    {
        public static void Exec(List<string> lista)
        {
            Console.WriteLine("Limpando sua lista");
            lista.Clear();
            MyUtil.FastLoading();
            Console.WriteLine("Lista limpa, deseja adicionar novos elementos? (S/N)");
            MyUtil.ReturnToMenu();
        }
    }
}