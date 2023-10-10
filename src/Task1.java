import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Zdravo svima");

//        Napisati program koji za unteti ceo broj ispisuje njegov kvadrat i kub

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int x = skener.nextInt();
        System.out.println("Ovo je kvadrat unetog broja :" + (x * x));
        System.out.println("Ovo je kub unetog broja :" + (x * x * x));

        //test za ignore out foldera


    }
}
