package Exercici17;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamExample{

     public static void main(String[] args) throws IOException {

            ArrayList<Persona> list= introDades();
            mostraDades();
        }
        public static ArrayList introDades() throws IOException {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
            ArrayList<Persona> list = new ArrayList<>();
            for (int i = 1; list.size()<3 ; i++) {
                Persona persona = new Persona();
                persona.setNombre("P"+i);
                persona.setEdad(18+i);
                objectOutputStream.writeObject(persona);
                list.add(persona);
            }
            objectOutputStream.close();
            return list;
        }
        public static void mostraDades() throws IOException {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
            try {
                while (true){
                    Persona personRead = (Persona) objectInputStream.readObject();
                    System.out.println(personRead);
                }
            }catch (EOFException e ){
                objectInputStream.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }




