package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        fillArray();
    }

    private static void fillArray() {

        int i;
        int a[] = new int[8];
        for (i = 0; i < a.length; i++){
            a[i] = i * 3;
        }
        System.out.println(Arrays.toString(a));
    }

}
