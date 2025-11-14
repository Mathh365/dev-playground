//Crie uma função que receba 3 notas e retorne a média

package faculdade_1semestre.Nivel6_funcoes;

public class Ex03
{
    public static void main(String[] args)
    {
        double[] numeros = {3.4, 7.8, 5.7, 8.5, 9.3};
        System.out.println(mediaNotas(numeros));
    }

    static double mediaNotas (double[] notas)
    {
        double soma = 0;
        int acumulador = 0;

        for (int i = 0; i < notas.length; i++)
        {
            soma += notas[i];
            acumulador ++;
        }

        return soma / acumulador;
    }
}

