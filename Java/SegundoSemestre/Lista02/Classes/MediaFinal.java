package SegundoSemestre.Lista02.Classes;

public class MediaFinal {

    public double AC1(double ac1l1, double ac1l2){
        if (NotaValida(ac1l1) && NotaValida(ac1l2)){
            return ((ac1l1 * 0.5) + (ac1l2 * 0.5));
        }
        else{
            System.out.println("Notas invalidas");
            return -1;
        }
    }
    public void AC2(){

    }
    public void AG(){

    }
    public void AF(){

    }

    public boolean NotaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }
}
