// /Crie uma função que receba um número e retorne true se ele for par,
// e false caso contrário.

package faculdade_1semestre.nivel6_funcoes;

public class Ex04 {
    public static void main(String[] args)
    {
        System.out.println(isPar(13873));
    }

    static boolean isPar (int num)
    {
        if ((num % 2 == 0)) return true;
        else return false;
    }

}
