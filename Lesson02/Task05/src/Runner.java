import java.util.Scanner;
/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //сздаем массив 5х5
        int[][] arr = new int[5][5];

        //инициализируем случайными значениями
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*20 - 10);
            }
        }
        System.out.println();

        //вывод массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //поиск и вывод суммы всех элементов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("сумма всех элементов равна " + sum);
        System.out.println();

        //сумма элементов строк и столбцов
        for (int i = 0; i < arr.length; i++) {
            int sumRow =0;
            for (int j = 0; j < arr[i].length; j++) {
                sumRow += arr[i][j];
            }
            System.out.println("сумма " + (i + 1) + " строки равна " + sumRow);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int sumCol = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumCol += arr[j][i];
            }
            System.out.println("сумма " + (i + 1) + " столбца равна " + sumCol);
        }
        System.out.println();

        //поменять максимальный и минимальный элемент массива
        int max = arr[0][0];
        int min = arr[0][0];
        //находим минимальный и максимальный элемент массива
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]) max = arr[i][j];
                if(min > arr[i][j]) min = arr[i][j];
            }
        }
        System.out.println();

        //присваиваем значение минимального максимальному и наоборот
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max == arr[i][j]) {
                    arr[i][j] = min;
                }else if(min == arr[i][j]) arr[i][j] = max;
            }
        }
        System.out.println();

        //вывод измененного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //замена в строке первого нулевого на последний отрицательный
        int firstZero;
        int lastNeg;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] < 0) {
                   lastNeg = arr[i][j];
               }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] == 0) {
                   firstZero = arr[i][j];
                   break;
               }
            }
        }
        System.out.println();



        //вывод измененного массива
        System.out.println("замена в строке первого нулевого на последний отрицательный");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
