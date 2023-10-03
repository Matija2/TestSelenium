import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int operand1 = scanner.nextInt();
        System.out.println("enter second number");
        int operand2 = scanner.nextInt();
        System.out.println("enter operator");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat je " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat je " + (operand1 - operand2));
        } else if (operator.equals("/")) {
            if (operand2 != 0) {
                System.out.println("Rezultat je " + (operand1 / operand2));
            } else {
                System.out.println("Deljenje sa nulom nije dozvoljeno");
            }
        } else if (operator.equals("*")) {
            System.out.println("Rezultat je " + (operand1 * operand2));
        } else {
            System.out.println("Niste uneli dobar operator");
        }


    }
}

