package tema8;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        HashMap<String, String[]> mapa = new HashMap();
        String[] castellano = {"HOLA", "CERDO", "GATO", "PERRO", "GOBIERNO", "PARTIDO", "TELEFONO", "TECLADO", "RATON", "PROFESOR"};
        String[] ingles = {"HELLO", "PIG", "CAT", "DOG", "GOVERNMENT", "PARTY", "PHONE", "KEYBOARD", "MOUSE", "TEACHER"};
        String[] frances = {"BONJOUR", "COCHON", "CHAT", "CHIEN", "GOUVERNEMENT", "PARTI", "TÉLÉPHONE", "CLAVIER", "SOURIS", "PROFESSEUR"};
        int idioma, acertadas = 0;

        mapa.put("CASTELLANO", castellano);
        mapa.put("INGLES", ingles);
        mapa.put("FRANCES", frances);

        for (int i = 0; i < 4; i++) {
            idioma = (int) (Math.random() * 3);
            acertadas =acertadas + preguntaYMuestra(mapa, idioma);
            System.out.println("Acertadas "+acertadas+"/4");

        }

    }

    private static int preguntaYMuestra(HashMap<String, String[]> mapa, int idioma) {
        Scanner sc = new Scanner(System.in);
        String palabra, palabraEscrita;
        int idioma2, nPalabra, acertada = 0;

        nPalabra = (int) (Math.random() * 10);

        do {
            idioma2 = (int) (Math.random() * 3);
        } while (idioma == idioma2);

        palabra = sacaPalabra(mapa, idioma, nPalabra);
        pregunta(idioma2, palabra);
        palabraEscrita = sc.next();
        palabraEscrita = palabraEscrita.toUpperCase();
        palabra = sacaPalabra(mapa, idioma2, nPalabra);
        if (palabra.equals(palabraEscrita)) {
            return acertada + 1;
        } else {
            return acertada;
        }

    }

    private static void pregunta(int idioma2, String palabra) {
        switch (idioma2) {
            case 0:
                System.out.println("¿Como es " + palabra + " en " + "CASTELLANO?");
                break;
            case 1:
                System.out.println("¿Como es " + palabra + " en " + "INGLES?");
                break;
            case 2:
                System.out.println("¿Como es " + palabra + " en " + "FRANCES?");
                break;
        }
    }

    private static String sacaPalabra(HashMap<String, String[]> mapa, int idioma, int nPalabra) {
        String[] palabras;
        String palabra = "";

        switch (idioma) {
            case 0:
                palabras = mapa.get("CASTELLANO");
                palabra = palabras[nPalabra];
                break;
            case 1:
                palabras = mapa.get("INGLES");
                palabra = palabras[nPalabra];
                break;
            case 2:
                palabras = mapa.get("FRANCES");
                palabra = palabras[nPalabra];
                break;
        }
        return palabra;
    }

}
