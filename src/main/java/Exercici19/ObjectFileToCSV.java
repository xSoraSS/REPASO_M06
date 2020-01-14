package Exercici19;

import java.io.*;
import java.util.ArrayList;

public class ObjectFileToCSV {

    public static ArrayList loadUsers(ArrayList list) throws IOException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("users.bin"));

        try {
            while (true){
                User userRead = (User) objectInputStream.readObject();
                System.out.println(userRead);
                list.add(userRead);
            }
        }catch (EOFException e ){
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       return list;
    }

    public static void writeUsersToCSV(ArrayList<User> list) throws IOException {
       FileWriter fw = new FileWriter("users2.bin",false);
       BufferedWriter bw = new BufferedWriter(fw);

       for (int i = 0; i < list.size() ; i++) {
           bw.write( list.get(i).getUserName()+","+list.get(i).getFirstName()+","+list.get(i).getLastName()+","+ list.get(i).getEmail()+"\n");
       }

       bw.close();
   }


    public static void main(String[] args) throws IOException {
       ArrayList<User> userslist = new ArrayList<>();
       loadUsers(userslist);
       writeUsersToCSV(userslist);
   }
}

class User implements Serializable {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

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
                "UserName='" + userName + '\'' +
                ", Nombre=" + firstName + '\'' +
                ", Apellidos=" + lastName + '\'' +
                ", Email=" + email + '\'' +
                ", Contraseña=" + password +
                '}';
    }
}