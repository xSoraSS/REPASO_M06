package Exercici20;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomWrite {
    public static void main(String[] args) throws IOException {
        ArrayList<Departament> list = new ArrayList<>();
        writeDepartament(list);
        show();
    }
    public static void writeDepartament (ArrayList list) throws IOException {
        File file = new File("departament.bin");
        RandomAccessFile randomAccessFile =new RandomAccessFile(file,"rw");

        StringBuffer stringBuffer = null;
        for (int i = 0; i <5 ; i++) {
            String s="";
            for (int j = 0; j < 10; j++) {
                char c = (char) (new Random().nextInt(25)+65);
                s+=c;
            }
            randomAccessFile.writeInt((i+1)*10);
            stringBuffer = new StringBuffer(s);
            stringBuffer.setLength(10);
            randomAccessFile.writeChars(stringBuffer.toString());

        }
        randomAccessFile.close();
    }

    public static void show() throws IOException {
        File file = new File("departament.bin");
        RandomAccessFile randomAccessFile =new RandomAccessFile(file,"r");
        int id, dep, position = 0;
        char nom[] = new char[10], aux;
        try {
            for (;;){
                randomAccessFile.seek(position);
                id=randomAccessFile.readInt();
                for (int i = 0; i <nom.length ; i++) {
                    aux = randomAccessFile.readChar();
                    nom[i] = aux;
                }
                String c = new String(nom);
                System.out.println( id+c);
                position += 24;
                if (randomAccessFile.getFilePointer() == randomAccessFile.length())
                    break;
            }
        }catch (EOFException e){
            randomAccessFile.close();
        }
    }

}
class Departament{

    private int id;
    private String nom;

    public Departament(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}'+"\n";
    }
}