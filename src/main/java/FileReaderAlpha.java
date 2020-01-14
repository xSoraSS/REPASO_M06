import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAlpha {

    public static void main(String[] args) throws IOException {
           FileReader f = new FileReader("alphabeta.txt");
            BufferedReader reader = new BufferedReader(f);
            boolean eof = false;
            while (!eof){
                String line = reader.readLine();
                if (line == null)
                    eof = true;
                else
                    System.out.print(line.toUpperCase() + " ");
            }
            reader.close();
    }
}
