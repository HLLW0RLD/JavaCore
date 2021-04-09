package lesson2;

public class Task5 {

    public static void main(String[] args) {

        int a[] = {9, 1, 5, 7, 11, 4, 30, 6, 23};

        int b = minArray(a);
        int c = maxArray(a);
        System.out.println(b + " " + c);

    }

    private static int maxArray(int[] a) {

        int i;
        int max = a[0];
        for(i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        return max;

    }

    private static int minArray(int[] a) {

        int i;
        int min = a[0];
        for(i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        return min;

    }

}
