import java.io.*;

public class RecordsTextCSV {

    String[] nombre = new String[3], apellido = new String[3], edad = new String[3];
    String line;
    int i = 0;
    File f = new File("textToCVS.txt");
    File fcsv = new File("textToCSV.csv");

    public void leer() throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {
            if (!line.equals("****")) {
                this.nombre[i] = line;
                this.apellido[i] = (line = br.readLine());
                this.edad[i] = (line = br.readLine());
                i++;
            }
        }
        br.close();
        fr.close();
    }

    public void mostrar() {
        for (int i = 0; i < this.nombre.length; i++) {
            System.out.println(this.nombre[i] + "\n" + this.apellido[i] + "\n" + this.edad[i]);
        }
    }

    void escribirCSV() throws IOException {
        FileWriter fw = new FileWriter(fcsv);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nom,Cognom,Edat\n");

        for (int j = 0; j < nombre.length; j++) {
            bw.write(this.nombre[j] + "," + this.apellido[j] + "," + this.edad[j] + "\n");
        }

        bw.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        RecordsTextCSV textToCSV = new RecordsTextCSV();
        textToCSV.leer();
        textToCSV.mostrar();
        textToCSV.escribirCSV();
    }
}
