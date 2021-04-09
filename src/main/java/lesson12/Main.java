package lesson12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 10000000;

    public static void main(String[] args) {

        float[] a = new float[SIZE];
        
    firstMethod(a);
    secondMethod(a);

    }

    private static void firstMethod(float[] a) {

        long t = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++){
            a[i] = 1;
        }
        System.out.println(t);

        for (int i = 0; i < a.length; i++){
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - t);

    }

    private static void secondMethod (float[] a) {
        for (int i = 0; i < a.length; i++){
            a[i] = 1;
        }

        long t = System.currentTimeMillis();
        Thread t1 = new Myrunnable1();
        Thread t2 = new Myrunnable2();
        System.out.println(t);
        t1.start();
        t2.start();
        System.out.println(System.currentTimeMillis() - t);

    }

    static class Myrunnable1 extends Thread {

        float[] a = new float[SIZE];


        @Override
        public void run() {

            for (int i = 0; i < a.length / 2 - 1; i++){
                 a[i] = (float)(a[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }

    static class Myrunnable2 extends Thread {

        float[] a = new float[SIZE];


        @Override
        public void run() {

            for (int i = a.length / 2; i < a.length; i++){
                a[i] = (float)(a[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}
