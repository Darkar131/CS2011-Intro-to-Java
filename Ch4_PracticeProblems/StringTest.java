public class StringTest {

    public static void main(String[] args) {

        String message = "Welcome to Java";

        System.out.println("abcd".length());
        System.out.println(message.charAt(1));
        System.out.println(message.substring(1, 3));

        String s = "a".concat("b");
        System.out.println(s);
        s += "c";
        System.out.println(s);

        System.out.println(s.toUpperCase());

        s = "    " + s + "    ";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.trim());
        System.out.println(s.trim().length());
    }

}