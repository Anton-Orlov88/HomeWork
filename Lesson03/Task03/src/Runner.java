import java.util.Scanner;

/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание и инициализация строки
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();

        //печать количества слов в строке
        String[] strArray = str.split(" ");
        System.out.println("В строке: " + str + " - " + strArray.length + " слов");

        //печать количества символов в каждом слове
        for(int i = 0; i < strArray.length; i++) {
            System.out.println("В слове " + strArray[i] + " - " + strArray[i].length() + " букв");
        }

        //вычисление первого самого длинного слова и подсчет букв v в нем
        String firstLongWord = strArray[0];
        int numV = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (firstLongWord.length() < strArray[i].length()) {
                firstLongWord = strArray[i];
            }
        }
        for (int i = 0; i < firstLongWord.length(); i++) {
            if (firstLongWord.charAt(i) == 'v') {
                numV++;
            }
        }
        System.out.println("первое самое длинное слово: " + firstLongWord + ". В нем " + numV + " букв v");

        //печать слов с четным числом символов
        System.out.println("слова с четным числом символов");
        for(int i = 0; i < strArray.length; i++) {
            int x = strArray[i].length();
            if (x%2 == 0) {
                System.out.println(strArray[i]);
            }
        }



    }
}
