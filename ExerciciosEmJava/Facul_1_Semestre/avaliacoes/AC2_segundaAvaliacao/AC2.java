package Facul_1_Semestre.avaliacoes.AC2_segundaAvaliacao;
import java.util.Scanner;

public class AC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaCorte = 0, pesoAC1 = 0, pesoAC2 = 0, pesoAG = 0, pesoAF = 0, somaDePesos = 0, mediaGeral = 0, porcentagemAprovados = 0, porcentagemRecuperacao = 0, porcentagemReprovados = 0;
        int tamanhoDaTurma = 0, aprovado = 0, recuperacao = 0, reprovado = 0;
        
        System.out.print("Quantos alunos ha na turma? Digite apenas numeros\nTurma: ");
        tamanhoDaTurma = sc.nextInt();
        sc.nextLine();

        double[] notaAC1 = new double[tamanhoDaTurma];
        double[] notaAC2 = new double[tamanhoDaTurma];
        double[] notaAG = new double[tamanhoDaTurma];
        double[] notaAF = new double[tamanhoDaTurma];
        double[] mediaFinal = new double[tamanhoDaTurma];
        String[] status = new String[tamanhoDaTurma];
        String[] nomeAlunos = new String[tamanhoDaTurma];
        
        do {            
            System.out.print("\nDigite o peso da AC1\nPeso: ");
            pesoAC1 = sc.nextDouble();
            System.out.print("\nDigite o peso da AC2\nPeso: ");
            pesoAC2 = sc.nextDouble();
            System.out.print("\nDigite o peso da AG\nPeso: ");
            pesoAG = sc.nextDouble();
            System.out.print("\nDigite o peso da AF\nPeso: ");
            pesoAF = sc.nextDouble();
            sc.nextLine();

            somaDePesos = pesoAC1 + pesoAC2 + pesoAG + pesoAF;
            
            if (somaDePesos != 100) System.out.println("\nERRO!! A soma dos pesos, deve dar exatamente 100, digite novamente.");
            
        }while(somaDePesos != 100);
        
        pesoAC1 = pesoAC1 / 100;
        pesoAC2 = pesoAC2 / 100;
        pesoAG = pesoAG / 100;
        pesoAF = pesoAF / 100;
        
        System.out.print("\nQual é a nota de corte?\nNota: ");
        notaCorte = sc.nextDouble();
        sc.nextLine();

        while ((notaCorte < 3) || (notaCorte >= 10)){            
            System.out.print("\nERRO!! A nota de corte deve estar entre 3 e 10\nDigite novamente: ");
            notaCorte = sc.nextDouble();
            sc.nextLine();
        }
        
        for(int i = 0; i < tamanhoDaTurma; i++){
            System.out.print("\nDigite o nome do aluno\nNome: ");
            nomeAlunos[i] = sc.nextLine();
            
            do{                
                System.out.print("\nDigite a nota da AC1 de " + nomeAlunos[i] + "\nNota: ");
                notaAC1[i] = sc.nextDouble();
            } while ((notaAC1[i] < 0) || (notaAC1[i] > 10));
            
            do {                
                System.out.print("\nDigite a nota da AC2 de " + nomeAlunos[i] + "\nNota: ");
                notaAC2[i] = sc.nextDouble();
            } while ((notaAC2[i] < 0) || (notaAC2[i] > 10));
            
            do {                
                System.out.print("\nDigite a nota da AG de " + nomeAlunos[i] + "\nNota: ");
                notaAG[i] = sc.nextDouble();
            }while ((notaAG[i] < 0) || (notaAG[i] > 10));
            
            do{                
                System.out.print("\nDigite a nota da AF de " + nomeAlunos[i] + "\nNotas: ");
                notaAF[i] = sc.nextDouble();
            }while ((notaAF[i] < 0) || (notaAF[i] > 10));
            
            mediaFinal[i] = (notaAC1[i] * pesoAC1) + (notaAC2[i] * pesoAC2) + (notaAG[i] * pesoAG) + (notaAF[i] * pesoAF);
            System.out.printf("\n-A media de %s é %.1f\n-", nomeAlunos[i], mediaFinal[i]);
            mediaGeral += mediaFinal[i];
            
            if (mediaFinal[i] == 10){
                aprovado ++;
                status[i] = "Aprovado com excelencia";
                System.out.println(status[i]);
            } else if (mediaFinal[i] >= notaCorte){
                aprovado++;
                status[i] = "Aprovado";
                System.out.println(status[i]);
            } else if (mediaFinal[i] < (notaCorte - 2)){
                recuperacao++;
                status[i] = "Recuperação";
                System.out.println(status[i]);
            } else if (mediaFinal[i] > (notaCorte - 2)){
                reprovado++;
                status[i] = "Reprovado";
                System.out.println(status[i]);
            }
            sc.nextLine();
        }
        
        for (int i = 0; i < tamanhoDaTurma; i++) {
            System.out.printf("""
                        -------------------------------------------------------
                            Aluno: %s
                            Notas AC1: %.1f / AC2: %.1f / AG: %.1f / AF: %.1f
                            Media Final: %.1f
                            Situação: %s
                            """, nomeAlunos[i], notaAC1[i], notaAC2[i], notaAG[i], notaAF[i], mediaFinal[i], status[i]);        
        }
        
        mediaGeral = mediaGeral / tamanhoDaTurma;
        porcentagemAprovados = (aprovado * 100) / tamanhoDaTurma;
        porcentagemReprovados = (reprovado * 100) / tamanhoDaTurma;
        porcentagemRecuperacao = (recuperacao * 100) / tamanhoDaTurma;

        System.out.println("\nSegue agora um relatorio com as medias finais de cada aluno, e status de cada um.");
        for (int i = 0; i < tamanhoDaTurma; i++) {
            System.out.printf("""
                        --------------------------------------
                            %s - %.1f
                            """, nomeAlunos[i], mediaFinal[i]);
        }
        
        System.out.printf("""
                    -------------------------------
                        Media da turma: %.1f
                        Alunos aprovados: %.0f%%
                        Recuperação: %.0f%%
                        Reprovados: %.0f%%
                    -------------------------------
                        """, mediaGeral, porcentagemAprovados, porcentagemRecuperacao, porcentagemReprovados);
    }
}
