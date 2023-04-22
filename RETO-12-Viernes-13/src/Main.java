import java.time.LocalDate;

/*
 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */
public class Main {
    public static void main(String[] args) {
        if(viernes13(1, 2021)) {
            System.out.println("Hay viernes 13 en enero de 2021");
        } else {
            System.out.println("No hay viernes 13 en enero de 2021");
        }

    }

    public static boolean viernes13(int mes, int ano) {
        LocalDate fecha = LocalDate.of(ano, mes, 13);
        return fecha.getDayOfWeek().getValue() == 5;
    }
}