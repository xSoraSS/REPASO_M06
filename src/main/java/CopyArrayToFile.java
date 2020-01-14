import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyArrayToFile {

    public void guardar() throws IOException {
        String[] arrayToFile = new String[5];
        File f = new File("arrayToFile.txt");
        FileWriter fr = new FileWriter(f);

        Scanner sc = new Scanner(System.in);
        System.out.println("Para dejar de escribir: 0");
        for (int i = 0; i < arrayToFile.length; i++) {
            arrayToFile[i] = sc.nextLine();
            if (!arrayToFile[i].equals("0")){
                fr.write(arrayToFile[i] + System.lineSeparator());
            }else{
                arrayToFile[i] = null;
                break;
            }
        }
    fr.close();
    }

    public void mostrar() throws IOException {
        File f = new File("arrayToFile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        CopyArrayToFile copyArray = new CopyArrayToFile();
        copyArray.guardar();
        copyArray.mostrar();
    }
}
