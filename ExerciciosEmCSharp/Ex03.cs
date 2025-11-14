//Crie uma função que receba 3 notas e retorne a média


double[] numeros = {3.4, 7.8, 5.7, 8.5, 9.3};
Console.WriteLine(Ex03.mediaNotas(numeros));



public static class Ex03
{
    public static double mediaNotas (double[] notas)
    {
        double soma = 0;
        int acumulador = 0;

        for (int i = 0; i < notas.Length; i++)
        {
            soma += notas[i];
            acumulador ++;
        }

        return soma / acumulador;
    }
}