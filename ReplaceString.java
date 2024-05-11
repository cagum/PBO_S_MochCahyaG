public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hello, how are you";
        String chageChar = string1.replace("H", "T");
        String changeSentence = string1.replace("Hello", "Morning");
        System.out.println("To replace character : " + chageChar);
        System.out.println("To replace sentence : " + changeSentence );
    }
}
