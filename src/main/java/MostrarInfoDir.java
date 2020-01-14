import java.io.File;
import java.util.Scanner;


    public class MostrarInfoDir {

        public static void mostrar() {
            System.out.println("Introduce Directorio: ");
            Scanner sc = new Scanner(System.in);
            File f = new File(sc.nextLine());
            System.out.println(f);
            String[] archivos = f.list();
            for (int i = 0; i < archivos.length; i++) {
                System.out.println(archivos[i]);
            }
        }
    }
//        public static void main(String[] args) {
//
//            MostrarInfoDir mostrar = new MostrarInfoDir();
//            mostrar.mostrar();
//        }
//    }
