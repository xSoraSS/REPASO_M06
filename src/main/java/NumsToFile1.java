import java.io.*;

public class NumsToFile1 {

      void escribir() throws IOException {
          System.out.println("CREANDO");
          String ruta = "/home/dam2a/Documents/Num11001200.txt";
          File f = new File(ruta);
          PrintWriter pwInput = new PrintWriter(f);

          for (int i = 1100; i < 1201; i++) {
              pwInput.println(i);
          }
          pwInput.close();
      }

      public static void main(String[] args) throws IOException {

        NumsToFile1 numsToFile1 = new NumsToFile1();
        numsToFile1.escribir();
    }
}
