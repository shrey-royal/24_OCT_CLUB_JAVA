public class Basic_runtime_Errors {
    public static void main(String[] args) {
        System.out.println("Before exception");

        // System.out.println(2/0);
        // String str = null;
        // int a[] = {1, 2, 3};
        String s = "abcd";

        try {
            // System.out.println(a[3]);
            // System.out.println(2/0);
            // System.out.println(str.length());
            System.out.println(s.charAt(6));
        } /*catch (ArithmeticException e) {
            e.printStackTrace();
            // System.out.println("Cannot divide by Zero");
        }*/ catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("After exception");
    }
}
