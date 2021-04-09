package lesson2;

public class Task4 {
    public static void main(String[] args) {
        squareArray();
    }

    private static void squareArray() {

        int i;
        int j;
        int a[][] = new int[4][4];
        for (i = 0; i < 4; i++){
            for (j = 0; j < 4; j++) {
                if(i == j){
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
