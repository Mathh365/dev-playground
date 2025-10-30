package avaliacoes.AC2_segundaAvaliacao.simulado;
import java.util.Scanner;

public class simuladoAC2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int estoqueMinimo, produtosCadastrados;
        
        System.out.println("Qual é a quantidade minima de estoque que um produto pode ter?");
        estoqueMinimo = sc.nextInt();
        if (estoqueMinimo <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        
        System.out.print("Qual é o total de produtos que voce vai cadastrar?\nTotal: ");
        produtosCadastrados = sc.nextInt();
        if (produtosCadastrados <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        sc.nextLine();
        
        String[] nomesProdutos = new String[produtosCadastrados];
        int[] estoqueProdutos = new int[produtosCadastrados];

        for (int i = 0; i < produtosCadastrados; i++){
            System.out.print("Digite o nome do produto " + (i + 1) + "\n:");
            nomesProdutos[i] = sc.nextLine();
        }

        // for (int i = 0; i < nomesProdutos.length; i++){
        //     System.out.println(nomesProdutos[i]);
        // }
    }
}
