import java.util.Scanner;

public class Vezba5 {
    /**
     * main metoda koja daje ispis za vezbu
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         *  param
         */
        int operand1 = 2;
        int operand2 = 3;
        /**
         * kreiranje staticke metode pod nazivom sum koja uzima dva parametra odnosno vrednosti,
         * u ovom slucaju vrednosti operand1 i operand2 varijable i vraca njihov zbir pomocu '+' operatora
         */
        int sum = operand1 + operand2;
        /**
         * pozivanje java naredbe system.out.println() koja se koristi za izlaz teksta ili podataka,
         * u ovom slucaju podatka metode sum
         */
        System.out.println(sum);

    }
}
