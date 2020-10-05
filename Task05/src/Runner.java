public class Runner {
    public static double Sum(int x, int y) {
        double z;
        z = 7*Math.pow(x, 2) + 3*Math.pow(x, 2) - 3*x*2*y + 6*x - 8*y;
        return z;
    }
    public static void main(String[] args) {
        double z;
        int x1, x2, x3, y1, y2, y3;
        x1 = 5; y1 = 1;
        x2 = 3; y2 = 2;
        x3 = 7; y3 = 3;
        z = Sum(x1, y1);
        System.out.println("z = 7 * %d ^2 + 3 * %d ^2 - 3 * %d * 2 * %d + 6 * %d - 8 * %d = %.0f", x1, y1, x1, y1, x1, y1, Sum(x1, y1));
        System.out.printf("z = 7 * %d ^2 + 3 * %d ^2 - 3 * %d * 2 * %d + 6 * %d - 8 * %d = %.0f", x1, y1, x1, y1, x1, y1, Sum(x1, y1));

    }
}
