/*
 * Crea una función que reciba un número decimal y lo trasforme a Octal
 * y Hexadecimal.
 * - No está permitido usar funciones propias del lenguaje de programación que
 * realicen esas operaciones directamente.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(octal(500));
        System.out.println(hexadecimal(500));
    }

    public static int octal(int numero){
        int numActual = numero;
        int convertido = 0;
        int invertido = 0;
        while (numActual > 0) {
            int residuo = numActual % 8;
            convertido = convertido * 10 + residuo;
            numActual /= 8;
        }
        while(convertido != 0){
            int digito = convertido % 10;
            invertido = invertido * 10 + digito;
            convertido /= 10;
        }
        return invertido;
    }
    public static String hexadecimal(int numero){
        int numActual = numero;
        StringBuilder convertido = new StringBuilder();
        StringBuilder invertido = new StringBuilder();
        while (numActual > 0) {
            int residuo = numActual % 16;
            if(residuo == 10){
                convertido.append("A");
            }else if(residuo == 11){
                convertido.append("B");
            }else if(residuo == 12){
                convertido.append("C");
            }else if(residuo == 13){
                convertido.append("D");
            }else if(residuo == 14){
                convertido.append("E");
            }else if(residuo == 15){
                convertido.append("F");
            }else{
                convertido.append(residuo);
            }
            numActual /= 16;
        }
        for(int i = convertido.length() - 1; i >= 0; i--){
            invertido.append(convertido.charAt(i));
        }
        return invertido.toString();

    }
}