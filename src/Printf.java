public class Printf {
    public static void main(String[] args) {
        double d = (113.0/112.0);
        int i = 5;

        System.out.println("Hello from number " + d + "\n" + i);
        System.out.printf("Hello from number %.5f, %d", d, i);


    }
}
