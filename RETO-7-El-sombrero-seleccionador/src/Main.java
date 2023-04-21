
import java.util.Scanner;

/*
 * Crea un programa que simule el comportamiento del sombrero selccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */
public class Main {
    // Gryfindor = 1 punto cada respuesta
    // Slytherin = 2 puntos cada respuesta
    // Hufflepuff = 3 puntos cada respuesta
    // Ravenclaw = 4 puntos cada respuesta
    private static int points = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.ask();

    }

    public void ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué prefieres: aventura o seguridad?");
        String r1 = sc.nextLine().toLowerCase();
        System.out.println("¿Qué es más importante para ti: la amistad o el poder?");
        String r2 = sc.nextLine().toLowerCase();
        System.out.println("¿Prefieres seguir las reglas o hacer lo que crees que es correcto?");
        String r3 = sc.nextLine().toLowerCase();
        System.out.println("¿Qué prefieres: trabajar en equipo o solo?");
        String r4 = sc.nextLine().toLowerCase();
        System.out.println("¿Qué es más importante para ti: el conocimiento o la sabiduría?");
        String r5 = sc.nextLine().toLowerCase();

        if (r1.equals("aventura")) {
            points += 1;
        } else {
            points += 3;
        }
        if (r2.equals("amistad")) {
            points += 3;
        } else {
            points += 2;
        }
        if (r3.equals("reglas")) {
            points += 4;
        } else {
            points += 1;
        }
        if (r4.equals("trabajar en equipo")) {
            points += 3;
        } else {
            points += 2;
        }
        if (r5.equals("conocimiento")) {
            points += 4;
        } else {
            points += 1;
        }

        if(points >= 1 && points <= 9) {
            System.out.println("¡Eres de Gryffindor!");
        } else if(points >= 10 && points <= 19) {
            System.out.println("¡Eres de Slytherin!");
        } else if(points >= 20 && points <= 29) {
            System.out.println("¡Eres de Hufflepuff!");
        } else if(points >= 30 && points <= 40) {
            System.out.println("¡Eres de Ravenclaw!");
        }
    }
}