import javax.xml.crypto.Data;
import java.io.*;

public class CopyFilesBin {

    private void copiarImagen() {

        try{
            FileInputStream in = new FileInputStream("copy.png");
            FileOutputStream out = new FileOutputStream("copied.png");
            DataInputStream dataIn = new DataInputStream(in);
            DataOutputStream dataOut = new DataOutputStream(out);

            byte[] l = dataIn.readAllBytes();

            for (int i = 0; i < l.length; i++) {
                dataOut.writeByte(l[i]);
            }

            dataIn.close();
            dataOut.close();
            in.close();
            out.close();

        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
    }

    public static void main(String[] args) {
        CopyFilesBin copyFilesBin = new CopyFilesBin();
        copyFilesBin.copiarImagen();
    }
}
