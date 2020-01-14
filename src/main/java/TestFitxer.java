import java.io.File;

public class TestFitxer {


    public void comprobar() {
        File f = new File("/home/dam2a/test");
        System.out.println("¿Existe el directorio " + f.getName() + "?");
        if (f.exists()) {
            System.out.println("El directorio existe y su ruta es: " + f.getAbsolutePath());
        } else {
            System.out.println("El directorio no existe.");
        }
    }
//
//    public static void main (String[]args){
//        TestFitxer test = new TestFitxer();
//        test.comprobar();
//    }
}




























































































//import java.io.*;
//import java.util.ArrayList;
//
//public class ObjectFileToCSV19 {
//   public static void main(String[] args) throws IOException {
//       ArrayList<User> userslist = new ArrayList<>();
//       loadUser(userslist);
//       writeUser(userslist);
//   }
//   public static ArrayList loadUser(ArrayList list) throws IOException {
//       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"));
//        try {
//            while (true){
//                User userRead = (User) objectInputStream.readObject();
//                System.out.println(userRead);
//                list.add(userRead);
//            }
//        }catch (EOFException e ){
//            objectInputStream.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//       return list;
//   }
//   public static void writeUser(ArrayList<User> list) throws IOException {
//       FileWriter fw = new FileWriter("user1.csv",false);
//       BufferedWriter bw = new BufferedWriter(fw);
//       for (int i = 0; i < list.size() ; i++) {
//           bw.write( list.get(i).getUsername()+","+list.get(i).getFirstname()+","+list.get(i).getLastname()+"\n");
//       }
//       bw.close();
//   }
