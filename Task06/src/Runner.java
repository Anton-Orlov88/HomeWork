public class Runner {
    public static void main(String[] args) {
    int x  = 17, y = 13;
    double sr = (x + y)/2;
        System.out.printf("Тане %d лет, Мише %d лет. Средний возраст: %.0f лет, " +
                "возраст Тани отличантся от среднего на %.0f года. Миши на %.0f года",
                x, y, sr, x - sr, y - sr);
    }
}
