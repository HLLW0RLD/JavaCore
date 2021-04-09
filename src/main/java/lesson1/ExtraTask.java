package lesson1;

import java.util.Scanner;

public class ExtraTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

        forthYear(year);

    }

    private static void forthYear(int year) {

        if(year % 100 == 0 && year % 400 != 0){
            System.out.println("год не високосный");
        }else if(year % 4 == 0){
            System.out.println("год високосный");
        }else {
            System.out.println("год не високосный");
        }

    }

}
