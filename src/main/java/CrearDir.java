import java.io.File;
import java.util.Scanner;

public class CrearDir {

    public static void crearDir() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Crea la Ruta de Directorio: ");
        File f = new File(sc.nextLine());
        if (f.exists()){
            System.out.println("El directorio ya existe: " + f.getAbsolutePath());
        }else{
            System.out.println("Creando Directorio...");
            f.mkdir();
        }
    }
//    public static void main(String[] args) {
//
//        CrearDir crearDirectorio = new CrearDir();
//        crearDirectorio.crearDir();
//    }
}

