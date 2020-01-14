import java.io.*;

public class FileTypes {

    File f = new File("types.txt");
    String line;

    private void escribirEnFichero() throws IOException {

        int datoInt = 1714;
        double datoDouble = 1.80;
        float datoFlo = 123456789;
        String datoStr = "AFA";

            FileWriter fw = new FileWriter(f);
            FileOutputStream fo = new FileOutputStream(f);
            DataOutputStream dataOut = new DataOutputStream(fo);

            dataOut.writeInt(datoInt);
            dataOut.writeDouble(datoDouble);
            dataOut.writeFloat(datoFlo);
            dataOut.writeBytes(datoStr);

            dataOut.close();
            fo.close();
            fw.close();

    }

    public void leerFichero() throws IOException  {

        FileInputStream fi = new FileInputStream(f);
        DataInputStream dataIn = new DataInputStream(fi);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Leer con BufferedReader");
        System.out.println(br.readLine());

        System.out.println("\nLeer con DataInput: ");
        System.out.println(dataIn.readInt());
        System.out.println(dataIn.readDouble());
        System.out.println(dataIn.readFloat());
        System.out.println(dataIn.readLine());

        br.close();
        fr.close();
        dataIn.close();
        fi.close();
    }

        public static void main (String[]args) throws IOException {
            FileTypes datos = new FileTypes();
            datos.escribirEnFichero();
            datos.leerFichero();
        }
}
