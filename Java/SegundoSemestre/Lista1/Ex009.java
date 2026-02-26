//Faça um programa que recebe um número e retorna o resultado de seu valor em fatorial. Por exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120.

public class Ex009 {
    public static void main(String[] args) {
        System.out.println(Ex009.Fatorial(10));
        // Ex009.Fatorial(9); variavel usada durante a criação do codigo, apenas para debug
    }





    
    public static int Fatorial (int numero){
        int resultado = numero, fat = numero;

        for (int i = 1; i < fat; i++) {
            resultado = resultado * (numero - 1);
            numero --;
            // System.out.println(resultado); variavel usada durante a criação do codigo, apenas para debug
        }

        return resultado;
    }
}
