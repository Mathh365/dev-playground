namespace MenuCases
{
    public static class Save
    {
        public static void Exec(List<string> lista)
        {
            FileManager.SaveList(lista);
            Console.Write("Salvando");
            MyUtil.Loading(1100);
            Console.Clear();
            Console.WriteLine("Salva com sucesso, voce pode encontrar sua lista dentro da pasta \"Downloads\" do seu computador");
        }
    }
}