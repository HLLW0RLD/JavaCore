package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        ArrayList<Integer> arrList = toArrayList(intArr);

        Box<Apple> appleBox = new Box<>();
        appleBox.inBox(new Apple());
        appleBox.inBox(new Apple());
        appleBox.inBox(new Apple());
        appleBox.inBox(new Apple());

        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.inBox(new Orange());
        orangeBox.inBox(new Orange());
        orangeBox.inBox(new Orange());

        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> anotherBox = new Box<>();
        appleBox.transfer(anotherBox);
    }

    public static <T> ArrayList <T> toArrayList(T[]arr){
        return new ArrayList<T>(Arrays.asList(arr));
    }

    private static void swap(Integer[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = (Integer) tmp;
    }

}