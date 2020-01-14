import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TreballadorsFile1 {

    Scanner sc = new Scanner(System.in);
    public void ingresarTrabajador() throws FileNotFoundException {

        String opcion = "y";
        ArrayList<String> trabajadores = new ArrayList<String>();
        int i = 0;
        while (opcion.equals("Y") || opcion.equals("y")) {
            System.out.println("Ingresa nom: ");
            String nom = sc.nextLine();
            System.out.println("Ingresa cognom: ");
            String cognom = sc.nextLine();
            System.out.println("Ingresa salari: ");
            int salari = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresa estat civil: ");
            String casat = sc.nextLine();
            String trabajador = nom + "\n" + cognom + "\n" + salari + "\n" + casat;
            trabajadores.add(i, trabajador);
            i++;


            System.out.println("Vols continuar? (Y o N)");
            opcion = sc.nextLine();
        }

        File f = new File("treballadors.txt");
        PrintWriter pwInput = new PrintWriter(f);

        for (i = 0; i < trabajadores.size(); i++) {
            pwInput.write(trabajadores.get(i) + "\n");
        }
        pwInput.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        TreballadorsFile1 treballadorsFile1 = new TreballadorsFile1();
        treballadorsFile1.ingresarTrabajador();
    }
}
