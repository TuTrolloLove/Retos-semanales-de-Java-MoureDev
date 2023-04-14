import java.util.List;

/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */

public class Main {
    public enum Player {
        P1(),
        P2();

        Player() {
        }

    }

    public static void tennisGame(List<Player> points) {
        int p1_points = 0, p2_points = 0;
        boolean finished = false;
        boolean error = false;
        for(Player p : points){
            error = finished;
            if (p == Player.P1) {
                p1_points += 1;
            } else if (p == Player.P2) {
                p2_points += 1;
            }
            if (p1_points >= 3 && p2_points >= 3){
                if (!finished && (Math.abs(p1_points - p2_points) <=1)) {
                    if (p1_points == p2_points) {
                        System.out.println("Deuce");
                    } else if (p1_points > p2_points) {
                        System.out.println("Ventaja P1");
                    } else {
                        System.out.println("Ventaja P2");
                    }
                }else{
                    finished = true;
            }

                }else{
                System.out.printf("{game[p1_points]} - {game[p2_points]}%n");

            }
        }
        if(error)
        System.out.println("Los puntos jugados no son correctos");
        else if (p1_points > p2_points){
            System.out.println("Ha ganado el P1");
        }else{
            System.out.println("Ha ganado el P2");
        }
    }


    public static void main(String[] args) {
        tennisGame(List.of(Player.P1, Player.P1, Player.P2, Player.P2,
                Player.P1, Player.P2, Player.P1, Player.P1));

        tennisGame(List.of(Player.P1, Player.P1, Player.P2, Player.P2,
                Player.P1, Player.P2, Player.P1, Player.P1, Player.P2, Player.P1));

        tennisGame(List.of(Player.P2, Player.P2, Player.P1, Player.P1,
                Player.P1, Player.P2));

        tennisGame(List.of(Player.P1, Player.P1));
    }
}