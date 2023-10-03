import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);

        System.out.println("Please enter dividend: ");
        int dividend = skener.nextInt();
        System.out.println("Please enter divisor");
        int divisor = skener.nextInt();

        System.out.println("Modulo is: " + (dividend % divisor));


    }
}
