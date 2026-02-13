public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "   Java Programming   ";

        System.out.println("Length of str1: " + str1.length());


        System.out.println("Character at index 4: " + str1.charAt(4));


        System.out.println("Substring from index 6: " + str1.substring(6));
        System.out.println("Substring from 0 to 5: " + str1.substring(0, 5));

        System.out.println("Equals 'Hello World': " + str1.equals("Hello World"));
        System.out.println("EqualsIgnoreCase 'hello world': " + str1.equalsIgnoreCase("hello world"));

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());


        System.out.println("Trimmed str2: '" + str2.trim() + "'");

    
        System.out.println("Contains 'World': " + str1.contains("World"));
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Ends with 'World': " + str1.endsWith("World"));

        
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

    
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

    
        String[] words = str1.split(" ");
        System.out.println("Splitting str1:");
        for (String word : words) {
            System.out.println(word);
        }

    
        System.out.println("Concatenation: " + str1.concat(" - " + str2.trim()));
    }
}
