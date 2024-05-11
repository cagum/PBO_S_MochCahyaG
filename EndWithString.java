public class EndWithString {
    public static void main(String[] args) {
        String string1 = "Hello, how are you?";
        System.out.println("The result is : " + string1.endsWith("u"));
        System.out.println("The result is : " + string1.endsWith("o"));
        System.out.println("The result is : " + string1.endsWith("you"));
        System.out.println("The result is : " + string1.endsWith("how"));
    }
}
