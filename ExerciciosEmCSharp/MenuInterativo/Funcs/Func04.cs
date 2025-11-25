namespace FuncoesDoMenu
{
    public static class Func04
    {
        public static void Exec (List<string> lista)
        {
            Console.WriteLine("Segue todos os elementos da sua lista de compras\n");

            if (lista.Count == 0)
            {
                Console.Write("Vazio, deseja adicionar itens?\n(SIM / NÃO)");
            }
            else
            {
                MyUtil.ExibirLista(lista);
            }
            MyUtil.ReturnToMenu();
        }
    }
}