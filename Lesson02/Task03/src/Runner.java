import java.util.Arrays;
import java.util.Scanner;
/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение " + (i + 1) + " элмента");
            array[i] = sc.nextInt();
        }

        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Элементы массива в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //Определение средн. арифметич. значений массива кратных 5 и некратных 10
        double average = 0;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%5 == 0 && array[i]%10 != 0) {
                sum +=array[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Чисел кратных 5 и некрытных 10 нету");
        } else {
            average = sum/count;
            System.out.println("среднее арифметическое: " + average);
        }

        //получение второго массива из отрицательных элементов первого
        //кратных трем и четных положительных первого

        int  countNew = 0;
        int[] newArray = new int[arrSize];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0 && array[i]%3 == 0) {
                newArray[countNew] = array[i];
                countNew++;
            } else if (array[i]%2 == 0 && array[i] > 0) {
                newArray[countNew] = array[i];
                countNew++;
            }
        }
        if (countNew == 0) {
            System.out.println("подходящих значений нет");
        } else {
            int[] newArr = new int[countNew];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = newArray[i];
            }

            //вывод в консоль  полученного массива
            System.out.println("Массив из отрицательных элементов первого " +
                    "кратных трем и четных положительных первого");
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }

            //сортировка по убыванию
            Arrays.sort(newArr);

            //вывод на экран отсортированного массива
            for (int value : newArr) {
                System.out.println(value);
            }
        }




    }
}
