import java.util.Scanner;

public class Matematica {
    public static double OperacoesBasicas(double n1, double n2){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
            Escolha uma operação, diigite um numero entre: \n
            1 - Adição
            2 - Subtração
            3 - Multiplicação
            4 - Divisão""");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                return n1 / n2;
            default:
                break;
        }
        return 0;
    } 
}
