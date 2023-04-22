/*
 * Dada una URL con parámetros, crea una función que obtenga sus valores.
 * No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
 *
 * Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
 * los parámetros serían ["2023", "0"]
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.getParams("https://retosdeprogramacion.com?year=2023&challenge=0&year=2024&challenge=1");
    }

    /**
     * Obtiene los parámetros de una URL.
     *
     * @param url URL con parámetros.
     * Primero, el código divide la cadena url en dos partes utilizando el carácter ? como separador.
     * La primera parte es la URL base y la segunda parte es la cadena de consulta.
     * Luego, el código toma la segunda parte (la cadena de consulta) y la divide en pares clave-valor
     * utilizando el carácter & como separador.
     * Después, el código itera sobre cada par clave-valor y divide cada uno en su clave y valor
     * utilizando el carácter = como separador. Finalmente, el código imprime el valor de cada par clave-valor en la consola.
     **/

    public void getParams(String url) {
        String[] params = url.split("\\?")[1].split("&");
        for (String param : params) {
            System.out.println(param.split("=")[1]);
        }
    }
}