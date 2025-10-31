package avaliacoes.AC2_segundaAvaliacao.simulado;
import java.util.Scanner;

public class simuladoAC2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int estoqueMinimo = 0, totalDeProdutos = 0; 
        double adequado = 0, baixo = 0, critico = 0, produtosACadastrar = 0;
        
        System.out.println("Qual é a quantidade minima de estoque que um produto pode ter?");
        estoqueMinimo = sc.nextInt();
        if (estoqueMinimo <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        
        System.out.print("Qual é o total de produtos que voce vai cadastrar?\nTotal: ");
        produtosACadastrar = sc.nextInt();
        if (produtosACadastrar <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        sc.nextLine();
        
        String[] nomeDosProdutos = new String[(int)produtosACadastrar];
        int[] quantidade = new int[(int)produtosACadastrar];
        String[] status = new String[(int)produtosACadastrar];

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
                    adequado += 1;
                    break;
                case "Baixo":
                    baixo += 1;
                    break;
                case "Critico":
                    critico += 1;
                    break;
                default:
                    break;
            }

            System.out.printf("""

                Produto: %s
                Quantidade: %d
                Status: %s\n""", nomeDosProdutos[i], quantidade[i], status[i]);
        }

        System.out.println("\nSegue um relatorio de todos os produtos em estoque: ");
        for (int i = 0; i < nomeDosProdutos.length; i++){
            System.out.printf("""
            ---------------------------------------
            Produto %d
            -Nome do produto             : %s
            -Quantidade em estoque       : %d
            -Status                      : %s\n""",i + 1, nomeDosProdutos[i], quantidade[i], status[i]);
        }
        System.out.println("\nTotal de produtos em estoque: " + totalDeProdutos);
        System.out.printf("""
                \n
                A porcentagem de produtos em cada categoria, é:
                Adequado: %.2f %%
                Baixo   : %.2f %%
                Critico : %.2f %%
                """,((adequado * 100) / produtosACadastrar), ((baixo * 100) / produtosACadastrar), ((critico * 100) / produtosACadastrar));
    }
}