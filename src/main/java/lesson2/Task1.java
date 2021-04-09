package lesson2;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        reversedArray();
    }

    private static void reversedArray() {

        int i;
        int a[] = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0};
        for (i = 0; i < a.length; i++){
            if (a[i] == 1){
                a[i] = 0;
            }else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
