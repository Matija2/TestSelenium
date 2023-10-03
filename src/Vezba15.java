import java.util.Scanner;

public class Vezba15 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite marku vozila");
        String carMake = skener.next();
        if (carMake.equalsIgnoreCase("Ford")) {
            System.out.println("Unesite broj vrata");
            int doors = skener.nextInt();
            switch (doors) {
                case 1:
                    System.out.println("Ford sa jednim vratima");
                    break;
                case 2:
                    System.out.println("Ford sa dvoje vrata");
                    break;
                case 3:
                    System.out.println("Ford sa troje vrata");
                    break;
                case 4:
                    System.out.println("Ford sa cetvoro vrata");
                    break;
                default:
                    System.out.println("Pogresan unos");
                    break;
            }
        }
    }
}

