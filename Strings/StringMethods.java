public class StringMethods {
    public static void main(String[] args) {
        String str = "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Cum nemo alias consequuntur dolorum odit aperiam in sed, autem culpa accusantium voluptates, facilis cupiditate quia natus. Possimus, maxime quod cum esse natus aliquam. Ab placeat reiciendis, veritatis blanditiis itaque eos quibusdam nam ipsa nemo dicta temporibus velit minima voluptates dignissimos beatae.";
        // String str = "Royal Technosoft";

        // String str1 = new String();
        // String str2 = new String("Lorem, ipsum dolor sit amet consectetur adipisicing elit. Cum nemo alias consequuntur dolorum odit aperiam in sed, autem culpa accusantium voluptates, facilis cupiditate quia natus. Possimus, maxime quod cum esse natus aliquam. Ab placeat reiciendis, veritatis blanditiis itaque eos quibusdam nam ipsa nemo dicta temporibus velit minima voluptates dignissimos beatae.");

        // Methods
        
        System.out.println(str.charAt(35));
        // System.out.println(str.length());
        // System.out.println(str.substring(10));
        // System.out.println(str.substring(6, 10));
        // System.out.println(str.indexOf(' ', 7));
        // System.out.println(str.indexOf(", ", 7));
        // System.out.println(str.lastIndexOf("a"));
        // System.out.println(str.startsWith("Lorem"));
        // System.out.println(str.startsWith("do", 13));
        // System.out.println(str.endsWith("."));
        // System.out.println("HeLlO".toLowerCase());
        // System.out.println("HeLlO".toUpperCase());
        // str = "   sd sd    ";
        // System.out.println("\n'" + str + "' -> " + str.length() + "\n'" + str.trim() + "' -> " + str.trim().length());
        // System.out.println(str.replace('a', 'A'));
        // System.out.println(str.replace("voluptates", "voluptates".toUpperCase()));
        // System.out.println(str.toLowerCase().contains("voluPtates".toLowerCase()));
        // String s = new String();
        // String s = "";
        // System.out.println(s.isEmpty());
        // int i = 2345;
        // String s = String.valueOf(i);
        // System.out.println(s + " -> " + ((Object)i).getClass().getSimpleName());
        // System.out.println(s + " -> " + s.getClass());

        // int ab = Integer.valueOf(s);
        // System.out.println(ab + " -> " + ((Object)ab).getClass().getName());

        // System.out.println("Hello ".concat("World."));
        // char a[] = new char[10];
        // a = str.substring(0, 10).toCharArray();
        
        // for (char c : a) {
        //     System.out.print(c + " ");
        // }
        // System.out.println();

        // System.out.println("Hello".equals("hello"));
        // System.out.println("Hello".equalsIgnoreCase("hello"));
        // System.out.println("Hello".compareToIgnoreCase("hello"));
        // str = "Saumyya";
        // System.out.println(String.format("this is a string example -> %s\n\n%d %d", str, 1, 2));
    }
}

/*
String Methods:
1. charAt(int index): Returns the character at the specified index.
2. length(): Returns the length of the string.
3. substring(int beginIndex): Returns a substring starting from the specified index.
4. substring(int beginIndex, int endIndex): Returns a substring within the specified range.
5. indexOf(int ch): Returns the index of the first occurrence of a specified character.
6. indexOf(int ch, int fromIndex): Returns the index of the first occurrence of a specified character starting from the given index.
7. indexOf(String str): Returns the index of the first occurrence of a specified substring.
8. lastIndexOf(int ch): Returns the index of the last occurrence of a specified character.
9. lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of a specified character before the given index.
10. lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
11. startsWith(String prefix): Checks if the string starts with the specified prefix.
12. endsWith(String suffix): Checks if the string ends with the specified suffix.
13. toLowerCase(): Converts the string to lowercase.
14. toUpperCase(): Converts the string to uppercase.
15. trim(): Removes leading and trailing white spaces.
16. replace(char oldChar, char newChar): Replaces all occurrences of a character with another character.
17. replace(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified CharSequence.
18. contains(CharSequence s): Checks if the string contains the specified sequence of characters.
19. isEmpty(): Checks if the string is empty.
20. valueOf(Object obj): Returns the string representation of an object.
*/