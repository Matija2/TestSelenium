import java.util.Scanner;

public class ParniBroj {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite broj za proveru: ");
        int broj = skener.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Uneti broj je paran!");}
            else {
                System.out.println("Uneti broj je neparan!");
            }

            skener.close();
        }
    }

