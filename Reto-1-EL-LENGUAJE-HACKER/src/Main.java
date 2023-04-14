import java.util.HashMap;
import java.util.Map;

public class Main {
    //Method to translate a text to leet
    public static String leetTranslator(String text) {
        String leetText = "";
        Map<String, String> leet = new HashMap<>();
        // Letters to leet
        leet.put("A", "4");
        leet.put("B", "I3");
        leet.put("C", "[");
        leet.put("D", ")");
        leet.put("E", "3");
        leet.put("F", "|=");
        leet.put("G", "&");
        leet.put("H", "#");
        leet.put("I", "1");
        leet.put("J", ",_|");
        leet.put("K", ">|");
        leet.put("L", "1");
        leet.put("M", "/\\/\\");
        leet.put("N", "^/");
        leet.put("O", "0");
        leet.put("P", "|*");
        leet.put("Q", "(_,)");
        leet.put("R", "I2");
        leet.put("S", "5");
        leet.put("T", "7");
        leet.put("U", "(_)");
        leet.put("V", "\\/");
        leet.put("W", "\\/\\/");
        leet.put("X", "><");
        leet.put("Y", "j");
        leet.put("Z", "2");

        // Numbers to leet
        leet.put("0", "o");
        leet.put("1", "L");
        leet.put("2", "R");
        leet.put("3", "E");
        leet.put("4", "A");
        leet.put("5", "S");
        leet.put("6", "b");
        leet.put("7", "T");
        leet.put("8", "B");
        leet.put("9", "g");

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toUpperCase(text.charAt(i));
            if (leet.containsKey(String.valueOf(c))) {
                leetText += leet.get(String.valueOf(c));
            } else {
                leetText += String.valueOf(c).toLowerCase();

            }

        }
        return leetText;
    }

    public static void main(String[] args) {
        System.out.println(leetTranslator("Aquí está un texto de prueba para ver si funciona el reto!"));
    }
}