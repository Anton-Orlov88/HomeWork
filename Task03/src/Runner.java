public class Runner {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for(int i = 0; i < args.length; i++) {
            System.out.printf(args[i] + " ");
        }
    }
}
