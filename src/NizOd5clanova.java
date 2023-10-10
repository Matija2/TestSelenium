import java.util.Arrays;

public class NizOd5clanova {

    public static void main(String[] args) {
        int mojNiz[] = new int[5];
        mojNiz[0] = 1;
        mojNiz[1] = 3;
        mojNiz[2] = 5;
        mojNiz[3] = 2;
        mojNiz[4] = 7;
        int max = mojNiz[0];

        for (int i = 0; i < mojNiz.length; i++) {
            if (mojNiz[i] > max) {
                max = mojNiz [i];
            }
        }
        System.out.println(max);
        Arrays.sort(mojNiz);
        System.out.println("Sortiran niz: " + Arrays.toString(mojNiz));


    }
}
