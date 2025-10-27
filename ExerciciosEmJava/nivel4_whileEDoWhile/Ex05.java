//Crie um algoritmo que simula uma máquina de venda automática. O
//usuário deve fornecer o valor do produto desejado e inserir o valor do
//pagamento até que o pagamento seja suficiente para comprar o
//produto.

package nivel4_whileEDoWhile;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorProduto, pagamento = 0, totalPago = 0;

        System.out.print("Digite o valor do produto que deseja comprar\nR$: ");
        valorProduto = sc.nextInt();

        do {
            System.out.print("Qual o valor do proximo pagamento?\nR$: ");
            pagamento = sc.nextDouble();
            totalPago = totalPago + pagamento;

            if ((valorProduto - totalPago) > 0){
                System.out.printf("Voce fez um pagamento no valor de R$ %.2f, falta %.2f\n", pagamento, (valorProduto - totalPago));
            }
        } while (totalPago < valorProduto);
        System.out.println("Maravilha, voce kitou sua divida");
    }
}
