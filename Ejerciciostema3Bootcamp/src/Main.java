public class Main {
    public static void main(String[] args) {
        suma(10, 5, 20);

        Coche miCoche = new Coche();
        System.out.println("Mi coche inicialmente tiene " + miCoche.puertas + " puertas");
        miCoche.añadirPuerta(1);
        System.out.println("Ahora, mi coche tiene " + miCoche.puertas + " puertas");

    }
    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static class Coche {
        public int puertas = 4;

        public void añadirPuerta(int puertasAAñadir) {
            puertas = puertas + puertasAAñadir;
        }
    }
    }

