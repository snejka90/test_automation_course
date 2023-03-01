package topic4;

public class Methods {
    public static int sum() {
        int a = 2;
        int b = 6;
        int c = a + b;
        if (b>a) {
            System.out.println("Numerele sunt introduse in ordinea gresita");
            return 0;
        }
        return c;
    }
    public int sum1 () {
        int x = 8;
        if (x > 0) {
            int sum = 0;
        }
        while (x > 0) {
            System.out.print("?");
        }
        return x;
    }
}
