import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Equipo {

    public void jugadores(){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        int N = alphabet.length();
        String name;
        Random r = new Random();

        Map<Integer, String> jugador = new HashMap<>();


        for (int i = 1; i < 17; i++) {
            name = "";
            for (int j = 0; j < 10; j++) {
                name += alphabet.charAt(r.nextInt(N));
            }

            jugador.put(i, name);
            System.out.println(jugador.size() + " " + jugador.getOrDefault(i, name));
        }
    }
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.jugadores();
    }
}
