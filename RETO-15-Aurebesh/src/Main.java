/*
 * Crea una función que sea capaz de transformar Español al lenguaje básico del universo
 * Star Wars: el "Aurebesh".
 * - Puedes dejar sin transformar los caracteres que no existan en "Aurebesh".
 * - También tiene que ser capaz de traducir en sentido contrario.
 *
 * ¿Lo has conseguido? Nómbrame en twitter.com/mouredev y escríbeme algo en Aurebesh.
 *
 * ¡Que la fuerza os acompañe!
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Traducir a Aurebesh: 1");
        System.out.println("Traducir a Español: 2");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1 -> {
                System.out.print("Introduce el texto: ");
                String text = sc.nextLine();
                translateAurebesh(text);
            }
            case 2 -> {
                System.out.print("Introduce el texto: ");
                String text = sc.nextLine();
                translateSpanish(text);
            }
            default -> System.out.println("Elije la opción corecta");
        }


    }

    public static void translateAurebesh(String text) {
        text = text.toLowerCase();
        StringBuilder traducido = new StringBuilder();
        // List String String con caracteres español y aurebesh
        Map<String, String> characters = new HashMap<>();
        characters.put("a", "Aurek");
        characters.put("b", "Besh");
        characters.put("c", "Cresh");
        characters.put("cd", "Cherek");
        characters.put("d", "Dorn");
        characters.put("e", "Esk");
        characters.put("Æ", "Enth");
        characters.put("eo", "Onith");
        characters.put("f", "Forn");
        characters.put("g", "Grek");
        characters.put("h", "Herf");
        characters.put("i", "Isk");
        characters.put("j", "Jenth");
        characters.put("k", "Krill");
        characters.put("kh", "Krenth");
        characters.put("l", "Leth");
        characters.put("m", "Mern");
        characters.put("n", "Nern");
        characters.put("ng", "Nen");
        characters.put("o", "Osk");
        characters.put("oo", "Orenth");
        characters.put("p", "Peth");
        characters.put("q", "Qek");
        characters.put("r", "Resh");
        characters.put("s", "Senth");
        characters.put("sh", "Sen");
        characters.put("t", "Trill");
        characters.put("th", "Thesh");
        characters.put("u", "Usk");
        characters.put("v", "Vev");
        characters.put("w", "Wesk");
        characters.put("x", "Xesh");
        characters.put("y", "Yirt");
        characters.put("z", "Zerek");

        for(int i=0;i<text.length();i++){
                if (characters.containsKey(String.valueOf(text.charAt(i)))){
                    traducido.append(characters.get(String.valueOf(text.charAt(i)))).append(", ");
                }else{
                    traducido.append(text.charAt(i)).append(", ");
                }
            }
        System.out.println(traducido);
        }

    public static void translateSpanish(String text) {
        StringBuilder traducido = new StringBuilder();
        // List String String con caracteres español y aurebesh
        Map<String, String> characters = new HashMap<>();
        characters.put("a", "Aurek");
        characters.put("b", "Besh");
        characters.put("c", "Cresh");
        characters.put("cd", "Cherek");
        characters.put("d", "Dorn");
        characters.put("e", "Esk");
        characters.put("Æ", "Enth");
        characters.put("eo", "Onith");
        characters.put("f", "Forn");
        characters.put("g", "Grek");
        characters.put("h", "Herf");
        characters.put("i", "Isk");
        characters.put("j", "Jenth");
        characters.put("k", "Krill");
        characters.put("kh", "Krenth");
        characters.put("l", "Leth");
        characters.put("m", "Mern");
        characters.put("n", "Nern");
        characters.put("ng", "Nen");
        characters.put("o", "Osk");
        characters.put("oo", "Orenth");
        characters.put("p", "Peth");
        characters.put("q", "Qek");
        characters.put("r", "Resh");
        characters.put("s", "Senth");
        characters.put("sh", "Sen");
        characters.put("t", "Trill");
        characters.put("th", "Thesh");
        characters.put("u", "Usk");
        characters.put("v", "Vev");
        characters.put("w", "Wesk");
        characters.put("x", "Xesh");
        characters.put("y", "Yirt");
        characters.put("z", "Zerek");

        String[] words = text.split(", ");
        for (String word : words) {
            for (Map.Entry<String, String> entry : characters.entrySet()) {
                if (entry.getValue().equals(word)) {
                    traducido.append(entry.getKey());
                    break;
                }
            }
        }
        System.out.println(traducido);
    }
    }
