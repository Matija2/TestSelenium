public class NizOd5clanova {

    public static void main(String[] args) {
        int max = 0;
        int mojNiz[] = new int[5];
        mojNiz[0] = 1;
        mojNiz[1] = 3;
        mojNiz[2] = 5;
        mojNiz[3] = 2;
        mojNiz[4] = 7;

        for (int i = 0; i < mojNiz.length; i++) {
            if (mojNiz[i] > max) {
                max = mojNiz [i];
            }
        }
        System.out.println(max);

    }
}
