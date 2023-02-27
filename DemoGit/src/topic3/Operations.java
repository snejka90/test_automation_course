package topic3;

public class Operations {

    public static void printAritmeticOperations() {
        int a = 60;
        int b = 20;

        System.out.println("a++:" + a++);
        System.out.println("++a:" + ++a);
    }

    public static void printRelationarOperations() {
        int a = 12;
        int b = 55;
        System.out.println("b >= a" + (b >= a));
    }

    public static void printLogicOperations() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b" + (a && b));
    }

    public static void useForAndWhile() {
        for(int x = 20; x<25; x = x+3) {
            System.out.println("value of x:" + x);
            System.out.println("\n");
        }
    }
}


