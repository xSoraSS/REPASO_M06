import java.io.*;

public class CopyDirFRFW {

    public void copiar () throws IOException {
        File dirCopy = new File("/home/dam2a/dirC");
        dirCopy.mkdir();
        File dir = new File("/home/dam2a/directorParaCopiar");

        for (File i : dir.listFiles()) {
            String pathOutDir = dirCopy.getAbsolutePath() +"/"+i.getName();
            File f = new File(pathOutDir);

            if (i.isDirectory()){
                f.mkdir();
            }else if(i.isFile()){
                FileReader fr = new FileReader(i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);

                int c=0;
                if ((c = fr.read()) > -1){
                    bw.write(c);
                }
                bw.close();
                fw.close();
                br.close();
                fr.close();
            }
        }
    }




    public static void main(String[] args) throws IOException {
        CopyDirFRFW directorio = new CopyDirFRFW();
        directorio.copiar();
    }
}
