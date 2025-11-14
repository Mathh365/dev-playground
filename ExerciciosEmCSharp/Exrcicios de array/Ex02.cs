// Crie uma função que receba o nome e a idade de uma pessoa e exiba
// uma mensagem:
// "Olá, <nome>, você tem <idade> anos."

Console.Clear();
Ex02.Saudacao("Matheus", 24);

public static class Ex02
{
    public static void Saudacao(string nome, int idade)
    {
        Console.WriteLine($"Ola {nome}, voce tem {idade} anos.");
        
    }
}