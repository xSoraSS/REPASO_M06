import java.io.*;

public class CharsFileReader {


    public void leer() throws IOException {
        File abc = new File("alphabeta12.txt");
        FileReader fr = new FileReader(abc);

        int caract = fr.read();

        while (caract != -1){
                System.out.println((char) caract);
                caract = fr.read();
        }
    }

    public static void main(String[] args) throws IOException {
        CharsFileReader fileReader = new CharsFileReader();
        fileReader.leer();
    }
}
