namespace FuncoesDoMenu
{
    public static class Clear
    {
        public static void Exec(List<string> lista)
        {
            Console.Clear();
            
            Console.WriteLine("Limpando sua lista");
            lista.Clear();

            MyUtil.FastLoading();

            Console.WriteLine("Lista limpa, deseja adicionar novos elementos? (S/N)");
            
            MyUtil.ReturnToMenu();
            Console.Clear();
        }
    }
}