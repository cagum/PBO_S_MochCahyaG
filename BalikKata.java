public class BalikKata {
    public static void main(String[] args) {
        String kata = "DIBALIK";
        StringBuilder BalikKata = new StringBuilder();

        for (int i = kata.length() -1; i >= 0; i--) {
            BalikKata.append(kata.charAt(i));
        }

        String BalikKataStr = BalikKata.toString();
        System.out.println("DIBALIK dibalik menjadi : " + BalikKataStr);
    
    }
}
