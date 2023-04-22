import java.util.Date;

/*
 * Crea un generador de números pseudoaleatorios entre 0 y 100.
 * - No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
 *
 * Es más complicado de lo que parece...
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        m.random();
    }

    public void random() throws InterruptedException {
        /*
         * MÉTODO 1: MICROSEGUNDOS
         * - Para 1 milisegundo para que no obtenga siempre los mismos microsegundos.
         * - Obtén el número de microsegundos desde el 1 de enero de 1970.
         * - Módulo 101.
         *
         * MÉTODO 2: NANOSEGUNDOS
         * - Obtén el número de nanosegundos desde el 1 de enero de 1970.
         * - Módulo 101.
         */

        // MÉTODO 1: MICROSEGUNDOS
        System.out.println("MÉTODO 1: MICROSEGUNDOS");
        for(int i=0;i<100;i++){
            Thread.sleep(1);
            System.out.println(System.currentTimeMillis() % 101);
        }

        System.out.println("MÉTODO 2: NANOSEGUNDOS");
        // MÉTODO 2: NANOSEGUNDOS
        for(int i=0;i<100;i++){
            System.out.println(System.nanoTime() % 101);
        }

    }
}
