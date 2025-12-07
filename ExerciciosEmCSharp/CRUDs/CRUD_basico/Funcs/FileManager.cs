namespace MenuFunctions
{
    static public class FileManager
    {
        public static void SaveList()
        {
            Console.Write("Qual será o nme do arquivo?\nNome: ");
            string name = Console.ReadLine();
            string path = @$"C:\Users\MIr4aii\OneDrive\Documents\repositorios\MeusRepositorios\dev-playground\ExerciciosEmCSharp\CRUDs\CRUD_basico\Files\{name}";
            
        }
    }
}