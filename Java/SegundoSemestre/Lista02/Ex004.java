//Escreva uma classe que receberá como parâmetro três números inteiros para ordenar. Crie uma classe com método main que instancie a classe Ordena, receba três números inteiros e exiba o resultado da execução do objeto ordena.  

package SegundoSemestre.Lista02;

import SegundoSemestre.Lista02.Classes.Ordena;

public class Ex004 {
    public static void main(String[] args) {
        Ordena x = new Ordena();

        x.Listar(x.Ordenar(10, 4, 9));
    }
}