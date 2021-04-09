package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        guessNumber();
    }

    private static void guessNumber() {

        int count = 0;
        Random rnd = new Random();
        int answer = rnd.nextInt(10);

        do {
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            if (userAnswer > answer) {
                System.out.println("Ваше число больше загаданного");
            } else if (userAnswer < answer) {
                System.out.println("Ваше число меньше загаданного");
            } else if (userAnswer == answer) {
                System.out.println("Вы угадали!");
                break;
            }
            count++;

        } while (count < 3);

        if(count == 3){
            System.out.println("вы проиграли");
        }

        System.out.println("Хотите сыграть еще?(да-1 нет-0)");

        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();

        while (true){
        if (repeat == 1){
            guessNumber();
        }else if(repeat == 0){
            System.out.println("Спасибо за игру");
            break;
        }else {
            System.out.println("Введите 1 или 0");
        }
        }
    }
}
