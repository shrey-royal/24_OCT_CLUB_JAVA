public class Stringsss {
    public static void main(String[] args) {
        String str = "String 1";    //1859651587
        String str1 = "String 2";   //1859651586
        
        str1 = "String 1";

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
    }
}
