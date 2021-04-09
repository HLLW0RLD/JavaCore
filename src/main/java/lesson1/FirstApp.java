package lesson1;

public class FirstApp {

    public static void main(String[] args) {
        float a = 1;
        float b = 2;
        float c = 3;
        float d = 4;
        float x = a * (b + (c / d));
        System.out.println(x);

        first();
        second();
        third();
        forth();
    }

    private static void forth() {
        String name = "Yury";
        System.out.println("Hello " + name);
    }

    private static boolean third() {
        int a = 5;
        if (a >= 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private static void second() {
        int a = -1;
        if (a >= 0){
            System.out.println("число положительное");
        }else {
            System.out.println("число отрицательное");
        }
    }

    private static boolean first() {
        int a = 15;
        int b = 3;
        int c = a + b;

        if (c >= 10 && c <=20){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
}

