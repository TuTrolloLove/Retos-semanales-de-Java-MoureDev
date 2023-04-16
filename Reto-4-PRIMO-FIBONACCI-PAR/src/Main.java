/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
public class Main {
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
            if (c == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Main main = new Main();
        String message = "";
        int number = 375;
        if (main.isPrime(number)) {
            message += number + " es primo, ";
        } else {
            message += number + " no es primo, ";
        }
        if (main.isFibonacci(number)) {
            message += "es fibonacci, ";
        }else{
            message += "no es fibonacci, ";
        }
        if (main.isEven(number)) {
            message += "y es par";
        } else {
            message += "y es impar";
        }
        System.out.println(message);
    }
}