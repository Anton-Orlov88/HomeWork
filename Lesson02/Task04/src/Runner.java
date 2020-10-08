import java.util.Scanner;
/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание массива 3х4
        int[][] arr = new int[3][4];

        //инициализация значениями с клавиатуры
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("введите значение " + (i+1) + " строки " + (j+1) + " столбца");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println();

        //вывод исходного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //замена значения всех элементов к-й строки массива значением 5
        System.out.println("введите номер строки в которой заменим элементы на 5");
        int numRow = sc.nextInt();
        for (int j = 0; j < arr[numRow-1].length; j++) {
            arr[numRow-1][j] = 5;
        }
        System.out.println();

        //вывод измененного массива
        System.out.println("массив с измененнными на 5 значениями строки " + numRow);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //замена элементов к-го столбца массива числом 10
        System.out.println("введите номер столбца в котором заменим элементы на 10");
        int numCol = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i][numCol - 1] = 10;
        }
        System.out.println();

        //вывод измененного массива
        System.out.println("массив с измененнными на 10 значениями столбца " + numCol);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();



    }
}
