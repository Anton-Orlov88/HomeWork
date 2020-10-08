/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание переменной String и инициализация
        String str = "I love my family";
        System.out.println("Первоначальная строка: " + str);
        String[] strArray = str.split(" ");

        //поиск последнего самого длинногои первого самого короткого слова
        String lastMaxLen = "";
        String firstMinLen = strArray[0];
        int lastMaxLenNum = 0, firstMinLenNum = 0;

        //поиск индекса первого самого короткого слова и последнего самого длинного
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() >= lastMaxLen.length()) {
                lastMaxLenNum = i;
            }
            if(strArray[i].length() < firstMinLen.length()) {
                firstMinLenNum = i;
            }
        }

        //замена первого самого короткого слова на последнее самое длинное
        System.out.println("замена первого самого короткого слова на последнее самое длинное");
        String str1 = strArray[lastMaxLenNum];
        strArray[lastMaxLenNum] = strArray[firstMinLenNum];
        strArray[firstMinLenNum] = str1;
        for(int i = 0; i < strArray.length; i++) {
            System.out.printf(strArray[i] + " ");
        }
        System.out.println();

        //печать всех слов строки которые начинаются на ту же букву что и первое самое короткое слово
        System.out.println("все слова строки которые начинаются на ту же букву что и первое самое короткое слово");
        for(int i = 0; i < strArray.length; i++) {
            if(firstMinLen.charAt(0) == strArray[i].charAt(0)) {
                System.out.println(strArray[i]);
            }
        }



    }



}
