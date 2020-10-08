/**
 * Autor Anton Orlov
 */

public class Runner {
    public static void main(String[] args) {
        //создание переменной String и инициализация строкой
        String str = "deed nun non level shahs";
        String[] strArray = str.split(" ");
        String longestWord = strArray[0];
        String shortestWord = strArray[0];
        String longSimWord = strArray[0];
        String shortSimWord = strArray[0];

        System.out.println("исходная строка: " + str);

        //поиск самого длинного последнее
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() >= longestWord.length()) {
                longestWord = strArray[i];
            }
        }
        System.out.println("последнее самое длинное слово: " + longestWord);

        //поиск первого самого короткого слова
        for(int i = (strArray.length - 1); i >= 0; i--) {
            if(strArray[i].length() <= shortestWord.length()) {
                shortestWord = strArray[i];
            }
        }
        System.out.println("первое самое короткое слово: " + shortestWord);

        //поиск первого самого длинного сомметричного слова
        for (int i = 0; i < strArray.length; i++) {
            int strLen = strArray[i].length();
            int q = 0;
            for(int z = 0, j = strLen-1; z < strLen/2; z++, j--) {
                if(strArray[i].charAt(j) != strArray[i].charAt(z)) {
                    q++;
                }
            }
            if(q == 0 && strArray[i].length() == longestWord.length()) {
                System.out.println("первое самое длинное симметричное слово: " + strArray[i]);
                break;
            }
        }

        //поиск самого короткого симметричного слова
        for (int i = strArray.length - 1; i > 0; i--) {
            int strLen = strArray[i].length();
            int q = 0;
            for(int z = 0, j = strLen-1; z < strLen/2; z++, j--) {
                if(strArray[i].charAt(j) != strArray[i].charAt(z)) {
                    q++;
                }
            }
            if(q == 0 && strArray[i].length() == shortestWord.length()) {
                System.out.println("последнее самое короткое симметричное слово: " + strArray[i]);
                break;
            }
        }

    }
}
