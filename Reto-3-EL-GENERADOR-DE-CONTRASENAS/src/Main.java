/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

import java.util.*;

public class Main {
    private boolean mayus = false;
    private boolean num = false;
    private boolean simbol = false;
    private int passwordLong = 0;

    public void askParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la contraseña: (entre 8 y 16)");
        passwordLong = sc.nextInt();
        sc.nextLine();
        if (passwordLong < 8 || passwordLong > 16) {
            System.out.println("La contraseña no cumple los requisitos");
            System.exit(0);
        }
        System.out.println("Introduce si quieres mayúsculas: y/n");
        if (sc.nextLine().equals("y")) {
            mayus = true;
        }
        System.out.println("Introduce si quieres números: y/n");
        if (sc.nextLine().equals("y")) {
            num = true;
        }
        System.out.println("Introduce si quieres símbolos: y/n");
        if (sc.nextLine().equals("y")) {
            simbol = true;
        }
    }

    public String generatePassword(int passwordLong) {
        List<Character> passwordGenerated = new ArrayList<>();
        int charactersLeft = passwordLong;
        // Comprobar que la contraseña cumple los requisitos

        // Generar contraseña
            if(mayus){
                // Crea un numero aleatorio entre 1 y 4
                Random r = new Random();
                int randomNumber = r.nextInt(2)+1;
                for(int j = 0; j< randomNumber; j++){
                    // Generar mayúsculas (num aleatorio entre 0 y 25 y le suma el valor ASCII de la letra A)
                    Random rand = new Random();
                    passwordGenerated.add((char) (rand.nextInt(26) + 'A'));
                }
                charactersLeft -= randomNumber;
            }
            if(num){
                Random r = new Random();
                int randomNumber = r.nextInt(2)+1;
                for(int j = 0; j< randomNumber; j++){
                    // Generar números (num aleatorio entre 0 y 9)
                    Random rand = new Random();
                    passwordGenerated.add((char) rand.nextInt(10));
                }
                charactersLeft -= randomNumber;
            }
            if(simbol){
                Random r = new Random();
                int randomNumber = r.nextInt(2)+1;
                for(int j = 0; j< randomNumber; j++){
                    String symbols = "!@#$%^&*()";
                    Random rand = new Random();
                    passwordGenerated.add(symbols.charAt(rand.nextInt(symbols.length())));
                }
                charactersLeft -= randomNumber;
            }
            // Generar minúsculas
            for(int j = 0; j < charactersLeft; j++){
                Random rand = new Random();
                passwordGenerated.add((char) (rand.nextInt(26) + 'a'));
            }
        // Barajar la lista de caracteres
        Collections.shuffle(passwordGenerated);

        // Crear la contraseña a partir de la lista de caracteres
        StringBuilder passwordGeneratedS = new StringBuilder();
        for (char c : passwordGenerated) {
            passwordGeneratedS.append(c);
        }
        return passwordGeneratedS.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.askParameters();
        System.out.println("La contraseña es :" + m.generatePassword(m.passwordLong));
    }
}