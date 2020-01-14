import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lapiz {

    ArrayList<Integer> color = new ArrayList<Integer>();
    ArrayList<Float> grosor = new ArrayList<Float>();

    void pintarLapiz(){
        for (int i = 0; i < (int) (Math.random() * 6) + 1; i++) {
            color.add(i, (int) (Math.random() * 7) + 2);
            grosor.add(i, (float) Math.random());

//            System.out.println("COLOR: " + color.get(i) + "      GROSOR: " + grosor.get(i));
        }
    }

    void ordenarLapizColor(){
        Collections.sort(color);
        System.out.println("Color:   " + color);
    }

    void ordenarLapizGrosor(){
        Collections.sort(grosor);
        System.out.println("Grosor:   " + grosor);
    }

    public static void main(String[] args) {
        Lapiz lapiz = new Lapiz();
        lapiz.pintarLapiz();
        lapiz.ordenarLapizColor();
        lapiz.ordenarLapizGrosor();
    }
}
