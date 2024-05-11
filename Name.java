public class Name {
    public static void main(String[] args) {
        printNama("NUGRAHA", 7);
    }

    public static void printNama(String str, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
