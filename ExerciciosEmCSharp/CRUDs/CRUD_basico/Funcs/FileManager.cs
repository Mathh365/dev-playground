namespace MenuCases
{
    static public class FileManager
    {
        public static void SaveList(List<string> list)
        {
            Console.Write("Qual será o nome do arquivo?\nNome: ");
            string name = Console.ReadLine();
            string path = @$"C:\Users\MIr4aii\OneDrive\Documents\repositorios\MeusRepositorios\dev-playground\ExerciciosEmCSharp\CRUDs\CRUD_basico\Files\ShoppingLists\{name}.txt"; //caminho onde as listas serao salvas

            if (File.Exists(path))
            {
                list.AddRange(File.ReadAllLines(path));
                File.WriteAllText(path, string.Empty);
                File.WriteAllLines(path, list);
                list.Clear();
            }
            else
            {
                File.WriteAllLines(path, list);
                list.Clear();
            }            
        }
    }
}
