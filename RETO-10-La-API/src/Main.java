import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/*
 * Llamar a una API es una de las tareas más comunes en programación.
 *
 * Implementa una llamada HTTP a una API (la que tú quieras) y muestra su
 * resultado a través de la terminal. Por ejemplo: Pokémon, Marvel...
 *
 * Aquí tienes un listado de posibles APIs:
 * https://github.com/public-apis/public-apis
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url("https://pokeapi.co/api/v2/pokemon/ditto")
                    .get()
                    .build();
            Response response = client.newCall(request).execute();
            assert response.body() != null;
            System.out.println(response.body().string());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}