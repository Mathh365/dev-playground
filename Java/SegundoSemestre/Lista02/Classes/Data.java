package SegundoSemestre.Lista02.Classes;

import java.util.Scanner;

public class Data {

    private String ExtrairMes(String data){

        String[] partes = data.split("/");
        int mes = Integer.parseInt(partes[1]);

        return NomeMes(mes);
    }

    private String NomeMes(int mes){

        switch (mes){

            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";

            default: return "Mês inválido";
        }
    }

    public void Menu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a data no formato dd/mm/aaaa:");
        String data = sc.nextLine();

        String mes = ExtrairMes(data);

        System.out.println("Mês correspondente: " + mes);

        sc.close();
    }
}
