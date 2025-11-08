package faculdade_1semestre.avaliacoes.AC1_primeiraAvaliacao;
import java.util.Scanner;

public class AC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ac1, ac2, ag, af, notaCorte, mediaFinal, mediaSemAG = 0;

        //Recebe todos os valores
        System.out.println("Todas as notas devem estar entre 0 - 10");
        System.out.print("Digite a nota da AC1 \nNota:");
        ac1 = sc.nextDouble();
        System.out.print("Digite a nota da AC2 \nNota:");
        ac2 = sc.nextDouble();
        System.out.print("Digite a nota da AG \nNota:");
        ag = sc.nextDouble();
        System.out.print("Digite a nota da AF \nNota:");
        af = sc.nextDouble();
        System.out.print("Digite a nota de corte (o minimo necessario para passar)\nNota:");
        notaCorte = sc.nextDouble();

        //Calcula a media final do aluno
        mediaFinal = (ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.1) + (af * 0.45);
        System.out.println("Sua media e " + mediaFinal);

        //Determina se o aluno foi aprovado ou nao com base na media final, e na nota que ele precisava (notaCorte), e em caso negativo, diz quanto faltou
        if (mediaFinal >= notaCorte){
            System.out.println("Parabens, voce foi aprovado");
        } else {
            System.out.println("Infelizmente voce foi reprovado, faltou " + (mediaFinal - notaCorte) + " para voce conseguir" );
        }

        //Apresenta de maneira organizada todas as notas do aluno
        System.out.printf("""
                Suas notas foram respectivamente:
                AC1: %.2f
                AC2: %.2f
                AG: %.2f
                AF: %.2f
                E sua nota de corte era: %.2f
                """, ac1, ac2, ag, af, notaCorte);

        //Esta parte diz respeito a um exercicio especifico da minha prova, onde eu deveria calcular a nota sem a AG, e aprsentar a diferença
        mediaSemAG = (ac1 * 0.15) + (ac2 * 0.3) + (af * 0.45);
        System.out.println("Caso sua nota da AG tivesse sido 0, sua nota seria seria: " + mediaSemAG + " com uma diferença de: " + (mediaFinal - mediaSemAG));

    }
}
