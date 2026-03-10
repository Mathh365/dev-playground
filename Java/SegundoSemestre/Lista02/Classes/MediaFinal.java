package SegundoSemestre.Lista02.Classes;

public class MediaFinal {

    private double AC1(double l1, double l2){
        if (isValid(l1) && isValid(l2)) return ((l1 * 0.5) + (l2 * 0.5));
        System.out.println("Notas invalidas, digite uma nota entre 0 e 10");
        return -1;
    }
    
    private double AC2(double l3, double l4, double l5, double l6, double l7){
        double[] notas = {l3, l4, l5, l6, l7};
        
        for (double item : notas) {
            if (!isValid(item)){
                System.out.println("Uma ou mais notas sao invalidas");
                return -1;
            }
        }

        return (l3 + l4 + l5 + l6 + l7) / 5;
    }

    private double AF(double p1, double p2){
        if (isValid(p1) && isValid(p2)) return (p1 + p2) / 2;
        System.out.println("Nota invalida, digite uma nota entre 0 e 10");
        return -1;
    }

    private boolean isValid(double nota) {
        return (nota >= 0) && (nota <= 10);
    }

    private double media(double ac1, double ac2, double ag, double af){
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.1) + (af * 0.45);
    }

    public double executorDaPipeline(double l1, double l2, double l3, double l4, double l5, double l6, double l7, double ag, double afParte1, double afParte2) {

        double ac1 = AC1(l1, l2);
        if (ac1 == -1) return -1;

        double ac2 = AC2(l3, l4, l5, l6, l7);
        if (ac2 == -1) return -1;

        double af = AF(afParte1, afParte2);
        if (af == -1) return -1;

        if (!isValid(ag)) {
            System.out.println("Nota AG inválida");
            return -1;
        }

        return media(ac1, ac2, ag, af);
    }
}
