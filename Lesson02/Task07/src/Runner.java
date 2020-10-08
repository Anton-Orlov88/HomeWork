/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание массива и инициализация значениями [-50;100]
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*100 - 50);
            }
        }

        //вывод массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }

        //создание одномерного массива элементы которого состоят из средних
        //арифметичских этих столбцов
        double[] arrOneDimensional = new double[7];//создание одномерного массива
        double[] arrAverage = new double[7];

        //подсчет суммы и среднего арифметического столбцов
        // и запись в массивы arrAverage и arrOneDimensional
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            arrAverage[i] = sum;
            arrOneDimensional[i] = sum/arr.length;
        }

        //вывод полученного массива средних арифметических
        System.out.println("массив из средних арифметическох столбцов");
        for (double value:
                arrOneDimensional) {
            System.out.printf("%3.2f ", value);
        }
        System.out.println();

        //вывод полученного массива сумм
        System.out.println("массив из сумм столбцов");
        for (double value:
                arrAverage) {
            System.out.printf("%3.2f ", value);
        }
        System.out.println();

        //создание одномерного массива элементы которого
        //суммы элементов ниже побочной диагонали
        int[] arrSum = new int[7];

        for (int i = 1; i < arr.length; ++i) {
            int sum = 0;
            for (int j = arr.length-i; j < arr[i].length; ++j) {
                sum += arr[i][j];
            }
            arrSum[i] = sum;
        }

        //вывод полученного массива сумм элементов ниже побочной диагонали
        System.out.println("массив из сумм элементов ниже побочной диагонали");
        for (int value:
                arrSum) {
            System.out.printf("%3d ", value);
        }
        System.out.println();

        //создание массива элементы которого произведение
        // первых и последних элементов строк
        int[] arrMultip = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arrMultip[i] = arr[i][0] * arr[i][6];
        }

        //вывод полученного массива произведений первого и последнего элемента строк
        System.out.println("массив произведений первого и последнего элемента строк");
        for (int value:
                arrMultip) {
            System.out.printf("%3d ", value);
        }
    }
}
