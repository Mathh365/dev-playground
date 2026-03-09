package SegundoSemestre.Lista02.Classes;

import java.lang.classfile.instruction.DiscontinuedInstruction.RetInstruction;

public class MediaFinal {

    private double AC1(double l1, double l2){
        if (IsValid(l1) && IsValid(l2)) return ((l1 * 0.5) + (l2 * 0.5));
        System.out.println("Notas invalidas, digite uma nota entre 0 e 10");
        return -1;
    }
    
    private double AC2(double l3, double l4, double l5, double l6, double l7){
        if (!IsValid(l3)) {System.out.println("Uma ou mais notas sao invalidas, por favor digite uma nota entre 0 e 10"); return -1;}
        if (!IsValid(l4)) {System.out.println("Uma ou mais notas sao invalidas, por favor digite uma nota entre 0 e 10"); return -1;}
        if (!IsValid(l5)) {System.out.println("Uma ou mais notas sao invalidas, por favor digite uma nota entre 0 e 10"); return -1;}
        if (!IsValid(l6)) {System.out.println("Uma ou mais notas sao invalidas, por favor digite uma nota entre 0 e 10"); return -1;}
        if (!IsValid(l7)) {System.out.println("Uma ou mais notas sao invalidas, por favor digite uma nota entre 0 e 10"); return -1;}

        return (l3 + l4 + l5 + l6 + l7) / 5;
    }

    private double AF(double p1, double p2){
        if (IsValid(p1) && IsValid(p2)) return (p1 + p2) / 2;
        System.out.println("Nota invalida, digite uma nota entre 0 e 10");
        return -1;
    }

    private boolean IsValid(double nota) {
        return (nota >= 0) && (nota <= 10);
    }

    private double Media(double ac1, double ac2, double ag, double af){
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.1) + (af * 0.45);
    }

    public double ExecutorDaPipeline(double l1, double l2, double l3, double l4, double l5, double l6, double l7, double ag, double afParte1, double afParte2) {

    double ac1 = AC1(l1, l2);
    if (ac1 == -1) return -1;

    double ac2 = AC2(l3, l4, l5, l6, l7);
    if (ac2 == -1) return -1;

    double af = AF(afParte1, afParte2);
    if (af == -1) return -1;

    if (!IsValid(ag)) {
        System.out.println("Nota AG inválida");
        return -1;
    }

    return Media(ac1, ac2, ag, af);
}
}
