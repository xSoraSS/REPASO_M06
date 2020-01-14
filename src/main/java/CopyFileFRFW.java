import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileFRFW {

    public void copiar () throws IOException {
        File copy = new File("copiar.txt");
        File paste = new File("copiando.txt");

        FileReader fr = new FileReader(copy);
        FileWriter fw = new FileWriter(paste);
        int caract = fr.read();

        while (caract != -1){
            fw.write((char) caract);
            caract = fr.read();
        }
        fw.close();

        System.out.println("Fichero copiado.");
    }

    public static void main(String[] args) throws IOException {
        CopyFileFRFW copy = new CopyFileFRFW();
        copy.copiar();
    }
}
