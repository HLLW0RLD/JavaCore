package lesson9;

public class App {

    public static void main(String[] args) {
        String a[][] = {{"17", "22", "3", "4"}, {"2", "5", "2", "7"},
                        {"0", "40", "2", "33"}, {"1", "8", "2", "9"}};
        try {
            System.out.println(MyArray(a));
        }catch (MyArraySizeException e){
            System.out.println("Не верный размер массива");
        }catch (MyArrayDataException e){
            System.out.println("Не удалось преобразовать массив");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

    private static int MyArray(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (a.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                try {
                    count = count + Integer.parseInt(a[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i , j);
                }
            }
        }
        return count;
    }
}
