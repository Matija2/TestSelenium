import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        // Your code here
        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite prvi broj");
        int a = skener.nextInt();

        System.out.println("Unesite drugi broj");
        int b = skener.nextInt();

        System.out.println("Rezultat sabiranja je " + (a + b));


    }
}
