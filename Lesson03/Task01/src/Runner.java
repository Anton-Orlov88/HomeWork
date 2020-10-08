import java.util.Scanner;
/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //создание и инициализация строки
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();

        //разбитие строки на массив слов
        String[] strArray = str.split(" ");

        //вывод количества слов в строке
        System.out.println("В строке " + str + " "  + strArray.length + " слов");

        //поиск слов содержащих менее 3-х символов
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() < 3) {
                System.out.println("В слове " + strArray[i] + " меньше 3-х символов");
            }
        }
    }
}
