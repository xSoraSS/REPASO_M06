public class CharsFileToScreen1{

        void escribir() {
            System.out.println("CREANDO ABECEDARIO");
            char letra, letrA;

            letra = 'a';
            letrA = 'A';
            for (int i = 0; i < 26; i++) {
                System.out.println((char)(letra+i) + " " + (char)(letrA+i));
            }
        }

        public static void main(String[] args){

            CharsFileToScreen1 charsFileToScreen1 = new CharsFileToScreen1();
            charsFileToScreen1.escribir();
        }
    }
