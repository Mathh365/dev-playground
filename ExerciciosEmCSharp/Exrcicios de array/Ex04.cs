// /Crie uma função que receba um número e retorne true se ele for par,
// e false caso contrário.


Console.WriteLine($"{Ex04.isPar(16736739)}");


public static class Ex04
{
    public static bool isPar (int num)
    {
        if ((num % 2 == 0)) return true;
        else return false;
    }
}