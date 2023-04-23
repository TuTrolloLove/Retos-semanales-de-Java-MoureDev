/*
 * Crea un pequeño juego que consista en adivinar palabras en un número máximo de intentos:
 * - El juego comienza proponiendo una palabra aleatoria incompleta
 *   - Por ejemplo "m_ur_d_v", y el número de intentos que le quedan
 * - El usuario puede introducir únicamente una letra o una palabra (de la misma longitud que
 *   la palabra a adivinar)
 *   - Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta
 *     uno al número de intentos
 *   - Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno
 *     al número de intentos
 *   - Si el contador de intentos llega a 0, el jugador pierde
 * - La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar ocultando más del 60%
 * - Puedes utilizar las palabras que quieras y el número de intentos que consideres
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        juego();
    }

    public static void juego() {
        // Array con todas las letras
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int intentos = 5;
        boolean ganar = false;
        // Número aleatorio de 0 a 25
        StringBuilder palabra = new StringBuilder();
        int aleatorio = (int)(Math.random()*12)+4;
        for (int i = 0; i<aleatorio; i++) {
            int aleatorio2 = (int)(Math.random()*26);
            palabra.append(letras[aleatorio2]);
        }
        System.out.println(palabra);
        StringBuilder palabra2 = new StringBuilder().append(palabra);
        // Ocultar letras aleatorias de palabra2 y que no supere el 60%
        int ocultar = (int)(Math.random()*palabra2.length()*0.6);
        for (int i = 0; i<ocultar; i++) {
            int aleatorio2 = (int)(Math.random()*palabra2.length());
            palabra2.setCharAt(aleatorio2, '_');
        }

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Tienes " + intentos + " intentos");
            System.out.println(palabra2);
            String respuesta = sc.nextLine();
            if(respuesta.isEmpty()){
                System.out.println("No has introducido nada");
            } else if(respuesta.length() == 1) {
                if(palabra2.toString().contains(respuesta) || palabra.toString().contains(respuesta)) {
                    for (int i = 0; i<palabra.length(); i++) {
                        if(palabra.charAt(i) == respuesta.charAt(0))
                            palabra2.setCharAt(i, respuesta.charAt(0));
                    }
                } else{
                    intentos--;
                    System.out.println("Error, te quedan " + intentos + " intentos");
                }
            }else if (respuesta.length() != palabra.length()) {
                intentos--;
                System.out.println("Error, te quedan " + intentos + " intentos");
            } else {
                if(respuesta.contentEquals(palabra)){
                    ganar = true;
                    System.out.println("Enhorabuena, has ganado!");
                }else{
                    intentos--;
                    System.out.println("Error, te quedan " + intentos + " intentos");
                }
            }
            if(palabra.toString().contentEquals(palabra2)){
                ganar = true;
                System.out.println("Enhorabuena, has ganado!");
            }
        }while(intentos>0 && !ganar);
    }
}