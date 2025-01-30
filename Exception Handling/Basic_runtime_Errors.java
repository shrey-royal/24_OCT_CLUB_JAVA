public class Basic_runtime_Errors {
    public static void main(String[] args) {
        System.out.println("Before exception");

        // System.out.println(2/0);
        String str = null;

        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // System.out.println("Cannot divide by Zero");
        }

        System.out.println("After exception");
    }
}
