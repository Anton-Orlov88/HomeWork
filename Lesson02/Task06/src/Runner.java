/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание массива 5х5
        int[][] arr = new int[5][5];

        //инициализация массива значениями [-25;25]
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*50-25);
            }
        }

        //вывод массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //среднее арифметическое элементов, стоящих над главной диагональю
        int sum = 0;
        int countNun = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
               if (i < j) {
                   sum += arr[i][j];
                   countNun++;
               }
            }
        }
        System.out.println("Среднее арифметическое элементов " +
                "над гдавной осью = " + (double)sum/countNun);

        //срежнее арифметическое элементов над побочной диагональлью
        int sumSide = 0;
        int countNunSide = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr[i].length - 1; j > 0; j--) {
                if (i > j) {
                    sumSide += arr[i][j];
                    countNunSide++;
                }
            }
        }
        System.out.println("Среднее арифметическое элементов " +
                "над побочной осью = " + (double)sumSide/countNunSide);
        System.out.println();

        //сумма минимальных элементов столбцов матрицы
        int minNum = arr[0][0];
        int sumMin = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[j][i] < minNum) {
                    minNum = arr[j][i];
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[j][i] < minNum) {
                    sumMin += arr[i][j];
                }
            }
        }
        System.out.println("Сумма минимальных элементов матрицы равна: " + sumMin);

        //максимальный элемент среди отрицательных
        int NegNum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[j][i] < 0) {
                    NegNum = arr[i][j];
                }
            }
        }
        int maxNegNam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((NegNum < arr[i][j]) && (arr[i][j] < 0)) {
                    maxNegNam = arr[i][j];
                }
            }
        }
        System.out.println("максимальное отрицательное число " + maxNegNam);

        //замена элементов главной диагонали на минимальный элемент матрицы
        int minEl = arr[0][0];

        //поиск минимального элемента
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (minEl > arr[i][j]) minEl = arr[i][j];

            }
        }

        //замена элементов главной диагонали на минимальный элемент
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j) arr[i][j] = minEl;
            }
        }

        //вывод нового массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
