
import java.util.Scanner;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */
public class Main {
    // Array de una posición
    public static String[] jugadas = new String[1];
    // Puntaciones
    public static int p1 = 0;
    public static int p2 = 0;

    public void pedir() {
        Scanner sc = new Scanner(System.in);
        int veces; // Veces que hay par de datos
        // Pedir los dos datos y guardarlos en el array
        System.out.println("Introduce piedra, papel, tijera, lagarto o spock");
        String jugadas = sc.nextLine();

        // Dividir la cadena en un array de palabras
        String[] palabras = jugadas.split(" ");

        // Asignar el arreglo palabras a la variable de instancia jugadas
        Main.jugadas = palabras;

        // Calcular el número de pares de datos
        veces = palabras.length / 2;

        System.out.println("Veces: " + veces);
    }

    public void calcular() {
        for (int i = 0; i < jugadas.length; i += 2) {
            String jugada1 = jugadas[i];
            if (i + 1 < jugadas.length) {
                String jugada2 = jugadas[i + 1];
                if (jugada1.equals("piedra") && jugada2.equals("papel")) {
                    p2++;
                } else if (jugada1.equals("tijera") && jugada2.equals("piedra")) {
                    p2++;
                } else if (jugada1.equals("lagarto") && jugada2.equals("piedra")) {
                    p2++;
                } else if (jugada1.equals("piedra") && jugada2.equals("spock")) {
                    p2++;
                } else if (jugada1.equals("papel") && jugada2.equals("tijera")) {
                    p2++;
                } else if (jugada1.equals("papel") && jugada2.equals("lagarto")) {
                    p2++;
                } else if (jugada1.equals("spock") && jugada2.equals("papel")) {
                    p2++;
                } else if (jugada1.equals("lagarto") && jugada2.equals("tijera")) {
                    p2++;
                } else if (jugada1.equals("tijera") && jugada2.equals("spock")) {
                    p2++;
                } else if (jugada1.equals("spock") && jugada2.equals("lagarto")) {
                    p2++;
                } else if (jugada1.equals("piedra") && jugada2.equals("piedra")) {
                    p1++;
                    p2++;
                } else if (jugada1.equals("papel") && jugada2.equals("papel")) {
                    p1++;
                    p2++;
                } else if (jugada1.equals("tijera") && jugada2.equals("tijera")) {
                    p1++;
                    p2++;
                } else if (jugada1.equals("lagarto") && jugada2.equals("lagarto")) {
                    p1++;
                    p2++;
                } else if (jugada1.equals("spock") && jugada2.equals("spock")) {
                    p1++;
                    p2++;
                } else {
                    p1++;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.pedir();
        m.calcular();
        if (p1 > p2)
            System.out.println("Gana el jugador 1");
        else if (p2 > p1)
            System.out.println("Gana el jugador 2");
        else
            System.out.println("Empate");
    }
}
