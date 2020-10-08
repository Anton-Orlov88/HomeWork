/**
 * Autor Anton Orlov
 */

public class Runner {
    public static void main(String[] args) {

        //создаем массив из 10 элементов и инициализируем значениями [-4;5]
        // выводим полученный массив на экран
        System.out.println("массив из 10 элементов проинициализированный значениями [-4;5]");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*9 -4;
            System.out.printf("%5.2f \n", array[i]);
        }
        System.out.println();

        // уменьшаем в 2 раза положительные элементы, заменяем на индекс
        // отциательные
        System.out.println("уменьшены в 2 раза положительные элементы, отрицательные заменены на индекс");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) array[i] = array[i] / 2;
            if (array[i] < 0) array[i] = i;

        }

        // выводим измененный массив
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5.2f \n", array[i]);
        }
    }
}
