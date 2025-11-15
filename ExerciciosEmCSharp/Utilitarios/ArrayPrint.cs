namespace Utilitarios
{
    public static class ArrayPrint
    {
        public static void Char(char[] array)
        {
            foreach (char item in array)
            {
                System.Console.WriteLine(item);
            }
        }

        public static void Int(int[] array)
        {
            foreach (int item in array)
            {
                System.Console.WriteLine(item);
            }
        }

        public static void String(string[] array)
        {
            foreach (string item in array)
            {
                System.Console.WriteLine(item);
            }
        }
    }
}

