public class ReturnMethod {
    public static void main(String[] args) {
       int d = 4;
       int f = 5;

       int result = sabiranje(d, f);
        System.out.println(result);

    }

    public static int sabiranje (int a, int b) {
        int sabiranje = a + b;
        return sabiranje;

    }
}
