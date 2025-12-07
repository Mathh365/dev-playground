namespace MenuCases
{
    public static class Save
    {
        public static void Exec(List<string> lista)
        {
            FileManager.SaveList(lista);
        }
    }
}