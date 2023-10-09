import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Zdravo, ja sam java program, molim Vas unesite jedan ceo broj: ");
        int a = skener.nextInt();
        System.out.println("Unesite drugi ceo broj: ");
        int b = skener.nextInt();
        int ostatak = a % b;
        System.out.println("Ovo je zbir vasa dva uneta broja: " + (a + b));
        System.out.println("Ovo je razlika vasa dva uneta broja: " + (a - b));
        System.out.println("Ovo je proizvod vasa dva uneta broja: " + (a * b));
        System.out.println("Ovo je ceo deo pri deljenju prvog broja drugim brojem: " + (a / b));
        System.out.println("Ovo je ostatak pri deljenju prvog broja drugim brojem: " + (ostatak));

    }
}
