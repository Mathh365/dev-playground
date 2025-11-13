//Crie uma função que receba 3 notas e retorne a média

public class Program
{
    static void Main(string[] args)
    {
        double[] numeros = new double {3.4, 7.8, 5.7, 8.5, 9.3};
        Console.WriteLine(Ex03.mediaNotas(notas));
    }
}






public static class Ex03
{
    public static double mediaNotas (double[] notas)
    {
        double soma = 0;
        int acumulador = 0;

        for (int i = 0; i < notas.Lenght; i++)
        {
            soma += notas[i];
            acumulador ++;
        }

        return soma / acumulador;
    }
}