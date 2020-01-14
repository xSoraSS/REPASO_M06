import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CVSToScreen {
    public void mostrar() throws IOException {

        String line;
        File fcsv = new File("cvstoscreen.csv");

        FileReader fr = new FileReader(fcsv);
        BufferedReader br = new BufferedReader(fr);

        int i = 1;
        while ((line = br.readLine()) != null) {
            String[] datos=line.split(",");

            if (!line.contains("firstname")) {
                System.out.println("Persona" + i);
                System.out.println("Firstname: " + datos[0]);
                System.out.println("Lastname: " + datos[1]);
                System.out.println("Username: " + datos[2]);
                System.out.println("Password: " + datos[3]);
                System.out.println("Email: " + datos[4]);
                System.out.println("****");
                i++;
            }
        }
        br.close();
        fr.close();
}

    public static void main(String[] args) throws IOException {
        CVSToScreen cvs = new CVSToScreen();
        cvs.mostrar();
    }
}
