public class sucesion {

    public static void Fibonacci() {

        long a = 0;
        long b = 1;
        long c;

        for (int i = 1; i <= 50; i++) {

            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;

        }

    }

    public static void main(String[] args) {
        Fibonacci();
    }

}
