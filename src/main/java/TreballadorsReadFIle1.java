import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TreballadorsReadFIle1 {

        public void leerTrabajador() throws FileNotFoundException {

            ArrayList<String> trabajadores = new ArrayList<String>();

            int i = 0;
            File f = new File("treballadors.txt");
            Scanner leerFichero = new Scanner(f);

            while (leerFichero.hasNext()) {
                System.out.println("\ntreballador " + (i+1));
                System.out.println("Nom:    " + leerFichero.nextLine());
                System.out.println("Cognom:    " + leerFichero.nextLine());
                System.out.println("Salari:    " + leerFichero.nextLine());
                System.out.println("Estat Civil:    " + leerFichero.nextLine());
                i++;
            }
            leerFichero.close();
        }


        public static void main(String[] args) throws FileNotFoundException {
            TreballadorsReadFIle1 leer = new TreballadorsReadFIle1();
            leer.leerTrabajador();
        }
    }

