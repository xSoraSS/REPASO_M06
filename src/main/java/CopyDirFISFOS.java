import java.io.*;

public class CopyDirFISFOS {

    private void copy() throws IOException {
        File dirCopy = new File("/home/dam2a/directorFISFOS");
        dirCopy.mkdir();
        File dir = new File("/home/dam2a/directorParaCopiar");

        for (File i : dir.listFiles()) {
            String pathOutDir = dirCopy.getAbsolutePath() +"/"+i.getName();
            File f = new File(pathOutDir);

            if (i.isDirectory()){
                f.mkdir();
            }else if(i.isFile()){
                FileInputStream fi = new FileInputStream(i);
                DataInputStream dataIn = new DataInputStream(fi);
                FileOutputStream fo = new FileOutputStream(f);
                DataOutputStream dataOut = new DataOutputStream(fo);

                int c=0;
                if ((c = fi.read()) > -1){
                    dataOut.write(c);
                }
                dataOut.close();
                fo.close();
                dataIn.close();
                fi.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        CopyDirFISFOS dir = new CopyDirFISFOS();
        dir.copy();
    }
}
