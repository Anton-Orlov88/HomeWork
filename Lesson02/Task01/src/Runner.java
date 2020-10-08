/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {

        // создаем массив
        int[] array = new int[7];

        // инициализируем значениями и выводим на экран
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*200 - 100);
            System.out.println(array[i]);
        }
        System.out.println();

        // считаем суммы элементов с четными и нечетными номерами и выводим на экран
        int sumEnn = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                System.out.println("Четный номер: " + i);
                sumEnn = sumEnn + array[i];
            } else {
                System.out.println("Нечетный номер: " + i);
                sumOdd = sumOdd + array[i];
            }
        }
        System.out.println("Сумма элементов с четными номерами = " + sumEnn);
        System.out.println("Сумма элементов с нечетными номерами = " + sumOdd);

        // находим отрицательное число
        int maxNum = 0;
        int indexMaxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                maxNum = array[i];
            }
        }

        // проверяем на значение наибольшего из отрицательных
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNum) {
                maxNum = array[i];
                indexMaxNum = i;
            }
        }

        // выводим значение и индекс наибольшего из отрицательных чисел
        if (maxNum == 0) {
            System.out.println("Нет отрицательных чисел");
        } else {
            System.out.println(
                    "Значение наибольшего из отрицательных чисел: " + maxNum
                            + " индекс: " + indexMaxNum);
        }






    }
}
