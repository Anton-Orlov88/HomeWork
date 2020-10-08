import java.util.Scanner;

/**
 * Autor Anton Orlov
 */
public class Runner {
    public static void main(String[] args) {
        //Создание строки str
        String str = "";
        Scanner sc = new Scanner(System.in);

        //инициализация строки с клавиатуры
        System.out.println("Введите строку");
        str = sc.nextLine();

        //вывод строки
        System.out.println("введенная строка: " + str);

        //создание массива строк из строки str
        String[] strArray = str.split(" ");
        String strNew = "";

        //замена знаков операции на их название
        for(int i = 0; i < strArray.length; i++) {
            for(int j = 0; j < strArray[i].length(); j++) {
                char ch = strArray[i].charAt(j);
                switch (ch) {
                    case '+':
                        strNew += " плюс ";
                        break;
                    case '-':
                        strNew += " минус ";
                        break;
                    case '/':
                        strNew += " делить на ";
                        break;
                    case '*':
                        strNew += " умножить на ";
                        break;
                    case '=':
                        strNew += " равно ";
                        break;
                    default:
                        strNew += ch;
                        break;
                }
            }
        }
        System.out.println("изменненная строка: " + strNew);


    }
}
