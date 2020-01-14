import java.io.*;

public class ComptaVocals {

    public void contar() throws IOException {
        File f = new File("vocales.txt");
        File fcsv = new File("vocales.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(fcsv);
        BufferedWriter bw = new BufferedWriter(fw);
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        String line;

        bw.write("a,e,i,o,u\n");
        while ((line = br.readLine()) != null) {
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'a') {
                    a++;
                }
                if (line.charAt(j) == 'e') {
                    e++;
                }
                if (line.charAt(j) == 'i') {
                    i++;
                }
                if (line.charAt(j) == 'o') {
                    o++;
                }
                if (line.charAt(j) == 'u') {
                    u++;
                }
            }
            bw.write(a + "," + e + "," + i + "," + o + "," + u+ "\n");
        }
        br.close();
        bw.close();
        fr.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        ComptaVocals vocales = new ComptaVocals();
        vocales.contar();
    }
}
