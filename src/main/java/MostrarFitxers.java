import java.io.File;
import java.util.Scanner;

public class MostrarFitxers {

    public static void mostrar() {
        System.out.println("Introduce Directorio: ");
        Scanner sc = new Scanner(System.in);
        File f = new File(sc.nextLine());
        if (f.listFiles() != null) {
            for (File i : f.listFiles()) {
                if (i.isFile()) System.out.println(i.getName());
            }
        }
    }
}
//    public static void main(String[] args) {
//
//        MostrarFitxers mostrar = new MostrarFitxers();
//        mostrar.mostrar();
//    }
//}