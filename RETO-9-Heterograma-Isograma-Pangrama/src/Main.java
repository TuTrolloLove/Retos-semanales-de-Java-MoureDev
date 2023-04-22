/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = sc.nextLine();
        if(heterograma(cadena))
            System.out.println("Es un heterograma");
        else
            System.out.println("No es un heterograma");

        if(isograma(cadena))
            System.out.println("Es un isograma");
        else
            System.out.println("No es un isograma");
        if(pangrama(cadena))
            System.out.println("Es un pangrama");
        else
            System.out.println("No es un pangrama");
    }

    /*
        * Función que comprueba si una cadena de texto es un heterograma.
        * @param cadena Cadena de texto a comprobar.
        * @return Devuelve true si la cadena es un heterograma, false en caso contrario.
        * Un heterograma es una palabra o frase que no tiene ninguna letra repetida.
     */
    public static boolean heterograma(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                for (int j = i + 1; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == c) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /*
        * Función que comprueba si una cadena de texto es un isograma.
        * @param cadena Cadena de texto a comprobar.
        * @return Devuelve true si la cadena es un isograma, false en caso contrario.
        * Un isograma es una palabra o frase en la que cada letra aparece el mismo número de veces.
        * Si cada letra aparece solo una vez, será un heterograma.
        * Si cada letra aparece dos veces, será un isograma de segundo orden y así sucesivamente
     */
    public static boolean isograma(String cadena) {
        int[] letras = new int[26];
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                if (c >= 'a' && c <= 'z') {
                    letras[c - 'a']++;
                }
            }
        }
        for (int letra : letras) {
            if (letra != 0 && letra != 2) {
                return false;
            }
        }
        return true;
    }
    /*
        * Función que comprueba si una cadena de texto es un pangrama.
        * @param cadena Cadena de texto a comprobar.
        * @return Devuelve true si la cadena es un pangrama, false en caso contrario.
        * Un pangrama es una frase que contiene todas las letras del alfabeto.
     */
    public static boolean pangrama(String cadena){
        Map<Character, Integer> letras = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letras.put(c, 0);
        }
        letras.put('ñ', 0);

        for(int i=0;i<cadena.length();i++){
            char c = cadena.charAt(i);
            if(Character.isLetter(c)){
                letras.remove(c, letras.get(c));
                letras.put(c, 50);
            }
        }

        for (char c : letras.keySet()) {
            if (letras.get(c) != 50) {
                return false;
            }
        }
        return true;
    }
}