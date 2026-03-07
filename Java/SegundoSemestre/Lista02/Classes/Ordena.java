package SegundoSemestre.Lista02.Classes;

import java.util.ArrayList;
import java.util.List;

public class Ordena {
    public ArrayList<Integer> Ordenar(int n1, int n2, int n3){
        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(n1);
        inteiros.add(n2);
        inteiros.add(n3);

        inteiros.sort(null);

        return inteiros;
    }

    public void Listar(ArrayList lista){
        for (var item : lista){
            System.out.println(item);
        }
    }
}
