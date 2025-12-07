namespace MenuCases
{
    static public class FileManager
    {
        public static void SaveList(List<string> myList)
        {
            Console.Write("Qual será o nome do arquivo?\nNome: ");
            string name = Console.ReadLine();
            string path = @$"C:\Users\MIr4aii\OneDrive\Documents\repositorios\MeusRepositorios\dev-playground\ExerciciosEmCSharp\CRUDs\CRUD_basico\Files\ShoppingLists\{name}.txt";
            
            File.WriteAllLines(path, myList);
        }
    }
}