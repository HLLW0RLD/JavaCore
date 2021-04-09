package lesson2;

public class FirstApp {

    public static void main(String[] args) {

        int k = 0;
        int a[][] = new int[3][3];
            for(int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                        a[i][j] = k++;
                        System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }

    }

}
