public class throwKey {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("i dont want zero");
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("default value" + " " + e);
            System.out.println(j);
        }
    }
}
