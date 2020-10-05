import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        int x, y, z, a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вес конфет");
        x = in.nextInt();
        System.out.println("Введите цену конфет");
        a = in.nextInt();
        System.out.println("Введите вес печенья");
        y = in.nextInt();
        System.out.println("Введите цену печенья");
        b = in.nextInt();
        System.out.println("Введите вес яблок");
        z = in.nextInt();
        System.out.println("Введите цену яблок");
        c = in.nextInt();
        d = x*a + y*b + z*c;
        System.out.printf("Общая стоимость покупки %d", d);



    }
}
