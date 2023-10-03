public class Vezba14 {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;
        int modulo = x % y;

        if (modulo == 0) {
            System.out.println("Ostatak ne postoji");
        } else if (modulo > 1000) {
            System.out.println("Ostatak je veci od 1000");
        } else if (modulo < 1000) {
            System.out.println("Ostatak je manji od 1000");
        } else {
            System.out.println("Greska!");
        }
    }


}

