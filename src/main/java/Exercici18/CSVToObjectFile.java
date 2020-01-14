package Exercici18;

import java.io.*;
import java.util.ArrayList;

public class CSVToObjectFile {

    private ArrayList<User> loadUsers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/users.csv"));
        String line;

        ArrayList<User> usersList = new ArrayList<>();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("users.bin"));

        while ((line = br.readLine()) != null){
            String[] datos=line.split(",");

            User user = new User();
            user.setUserName(datos[0]);
            user.setFirstName(datos[1]);
            user.setLastName(datos[2]);
            user.setEmail(datos[3]);
            user.setPassword(datos[4]);
            objectOutputStream.writeObject(user);
            usersList.add(user);

        }
        objectOutputStream.close();
        br.close();

        return usersList;
    }

    private void writeUsers() throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("users.csv"));

        try {
            while (true){
                User userRead = (User) objectInputStream.readObject();
                System.out.println(userRead);
            }
        }catch (EOFException e ){
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        CSVToObjectFile csv = new CSVToObjectFile();
        csv.loadUsers();
        csv.writeUsers();
    }
}

class User implements Serializable {
    private String userName;
    private String firstName;
    private String email;
    private String password;
    private String lastName;

    public User() {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "User='" + userName + '\'' +
                ", Nombre=" + firstName + '\'' +
                ", Apellidos=" + lastName + '\'' +
                ", Email=" + email + '\'' +
                ", Contraseña=" + password +
                '}';
    }
}
