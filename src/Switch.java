import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        double operand1 = scanner.nextDouble();
        System.out.println("enter second number");
        double operand2 = scanner.nextDouble();
        System.out.println("enter operator");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Rezultat je " + (operand1 + operand2));
                break;
            case "-": {
                System.out.println("Rezultat je " + (operand1 - operand2));
            }
            break;
            case "/": {
                if (operand2 != 0) {
                    System.out.println("Rezultat je " + (operand1 / operand2));
                } else {
                    System.out.println("Deljenje sa nulom nije dozvoljeno");
                }
            }
            break;
            case "*": {
                System.out.println("Rezultat je " + (operand1 * operand2));
            }
            break;
            default:
                System.out.println("nepoznata operacija");

        }
    }
}

