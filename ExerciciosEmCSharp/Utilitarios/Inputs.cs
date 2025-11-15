namespace Utilitarios
{
    public static class Input
    {
        static public int ReadInt()
        {
            return Convert.ToInt32(Console.ReadLine());
        } 
        static public double ReadDouble()
        {
            return Convert.ToDouble(Console.ReadLine());
        } 
        static public char ReadChar()
        {
            return Convert.ToChar(Console.ReadLine());
        } 
        static public string ReadString()
        {
            return Console.ReadLine();
        } 
    }
}