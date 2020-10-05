public class Runner {
    public static void main(String[] args) {
        System.out.println("Arguments");
        for(int i = 0; i < args.length; i++) {
            System.out.printf(" " + args[i]);
        }
        System.out.println(System.lineSeparator() + "Reverse arguments");
        for(int i = args.length - 1; i >= 0; i--) {
            System.out.printf(" " + args[i]);
        }
        System.out.println(System.lineSeparator() + args[3] + " " + args[2] + " " + args[0] + " " + args[1]);
    }
}
