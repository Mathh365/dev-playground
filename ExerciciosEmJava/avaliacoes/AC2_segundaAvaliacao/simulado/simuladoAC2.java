package avaliacoes.AC2_segundaAvaliacao.simulado;
import java.util.Scanner;

public class simuladoAC2 {
    public static void main(String[] args){
        //---------------------------------------------------------------------------------------
        // Declaraçoes
        Scanner sc = new Scanner(System.in);
        int estoqueMinimo = 0, totalDeProdutos = 0, reposiaoNecessaria = 0, estoqueIdeal = 0, reposicaoTotal = 0;
        double adequado = 0, baixo = 0, critico = 0, produtosACadastrar = 0;
        //---------------------------------------------------------------------------------------
        
        System.out.println("Qual é a quantidade minima de estoque que um produto pode ter?");
        estoqueMinimo = sc.nextInt();
        if (estoqueMinimo <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        
        System.out.print("Qual é o total de produtos que voce vai cadastrar?\nTotal: ");
        produtosACadastrar = sc.nextInt();
        if (produtosACadastrar <= 0) System.out.println("ERRO!! O numero deve ser maior do que zero(0)");
        sc.nextLine();
        
        //------------------------------------------------------------------
        // Declaração dos arrays
        String[] listaDeProdutos = new String[(int)produtosACadastrar];
        int[] quantidade = new int[(int)produtosACadastrar];
        String[] status = new String[(int)produtosACadastrar];
        //------------------------------------------------------------------

        for (int i = 0; i < produtosACadastrar; i++){
            System.out.print("\nDigite o nome do produto " + (i + 1) + "\nProduto:");
            listaDeProdutos[i] = sc.nextLine();
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
                Status: %s\n""", listaDeProdutos[i], quantidade[i], status[i]);
        }

        System.out.println("\nSegue um relatorio de todos os produtos em estoque: ");
        for (int i = 0; i < listaDeProdutos.length; i++){
            System.out.printf("""
                ---------------------------------------
                Produto %d
                -Nome do produto             : %s
                -Quantidade em estoque       : %d
                -Status                      : %s
                """,i + 1, listaDeProdutos[i], quantidade[i], status[i]);
        }
        System.out.println("\nTotal de produtos em estoque: " + totalDeProdutos);
        System.out.printf("""
            
            A porcentagem de produtos em cada categoria, é:
            Adequado: %.2f %%
            Baixo   : %.2f %%
            Critico : %.2f %%
            """,((adequado * 100) / produtosACadastrar), ((baixo * 100) / produtosACadastrar), ((critico * 100) / produtosACadastrar));

        System.out.println("\nQual o estoque ideal para cada produto?");
        estoqueIdeal = sc.nextInt();
        if (estoqueIdeal <= 0){
            while(estoqueIdeal <= 0) {
                System.out.println("Invalido, digite um numero maior que 0\nEstoque minimo: ");
                estoqueIdeal = sc.nextInt();
            }
        }

        System.out.println("\nRelatorio de reposição: ");
        for (int i = 0; i < listaDeProdutos.length; i++){
            if (quantidade[i] < estoqueIdeal){
                reposiaoNecessaria = estoqueIdeal - quantidade[i];
                reposicaoTotal += reposiaoNecessaria;
                System.out.printf("\nProduto: %s -- Falta: %dun.", listaDeProdutos[i], reposiaoNecessaria);
            } else {
                System.out.println("\n\nNão ha necessidade de reposição para " + listaDeProdutos[i] + "\nQuantidade em estoque: " + quantidade[i]);
            }
        }

        System.out.printf("""
            
            Total de produtos para reposição                     : %d
            Porcentagem de reposição em relação ao estoque total : %.1f%%
            \n
            """, reposicaoTotal,(((double)reposicaoTotal * 100) / (double)totalDeProdutos));
    }
}