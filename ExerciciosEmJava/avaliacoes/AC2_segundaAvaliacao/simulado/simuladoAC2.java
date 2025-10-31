package avaliacoes.AC2_segundaAvaliacao.simulado;
import java.util.Scanner;

public class simuladoAC2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int estoqueMinimo = 0, produtosACadastrar = 0,  totalDeProdutos = 0, adequado = 0, baixo = 0, critico = 0;
        
        System.out.println("Qual é a quantidade minima de estoque que um produto pode ter?");
        estoqueMinimo = sc.nextInt();
        if (estoqueMinimo <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        
        System.out.print("Qual é o total de produtos que voce vai cadastrar?\nTotal: ");
        produtosACadastrar = sc.nextInt();
        if (produtosACadastrar <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        sc.nextLine();
        
        String[] nomeDosProdutos = new String[produtosACadastrar];
        int[] quantidade = new int[produtosACadastrar];
        String[] status = new String[produtosACadastrar];

        for (int i = 0; i < produtosACadastrar; i++){
            System.out.print("\nDigite o nome do produto " + (i + 1) + "\nProduto:");
            nomeDosProdutos[i] = sc.nextLine();
            System.out.print("Quantos voce tem em estoque?\nEstoque:");
            quantidade[i] = sc.nextInt();
            sc.nextLine();

            if (quantidade[i] >= estoqueMinimo) status[i] = "Adequado";
            else if (quantidade[i] >= (estoqueMinimo / 2)) status[i] = "Baixo";
            else if (quantidade[i] < (estoqueMinimo / 2)) status[i] = "Critico";

            totalDeProdutos += quantidade[i];
            
            switch (status[i]) {
                case "Adequado":
                    adequado ++;
                    break;
                case "Baixo":
                    baixo ++;
                    break;
                case "Critico":
                    critico ++;
                    break;
                default:
                    break;
            }

            System.out.printf("""

                Produto: %s
                Quantidade: %d
                Status: %s\n""", nomeDosProdutos[i], quantidade[i], status[i]);
        }

        System.out.println("Segue um relatorio de todos os produtos em estoque: ");
        for (int i = 0; i < nomeDosProdutos.length; i++){
            System.out.printf("""
            
            Produto %d
            -Nome do produto             : %s
            -Quantidade em estoque       : %d
            -Status                      : %s\n""",i, nomeDosProdutos[i], quantidade[i], status[i]);
        }
        System.out.println("Total de produtos em estoque: " +   totalDeProdutos);
        System.out.printf("""
                \n\n
                A porcentagem de produtos em cada categoria, é:
                Adequado: %.2f %
                Baixo   : %.2f %
                Critico : %.2f %
                """,((adequado / 100) * totalDeProdutos), ((baixo / 100) * totalDeProdutos), ((critico / 100) * totalDeProdutos));
    }
}