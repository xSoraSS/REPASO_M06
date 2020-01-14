import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CharsToFile1 {

    void escribir() throws IOException {
        System.out.println("CREANDO ABECEDARIO");
        String ruta = "alphabeta.txt";
        File f = new File(ruta);
        PrintWriter pwInput = new PrintWriter(f);
        char[] letra = new char[26];

        for (int i = 0; i < letra.length; i++) {
            letra[i] = (char) ('a' + i);
            pwInput.println(letra[i]);
        }
        pwInput.close();
    }

    public static void main(String[] args) throws IOException {

        CharsToFile1 charsToFile1 = new CharsToFile1();
        charsToFile1.escribir();
    }
}
