package DAY3;

public class pyramid {
    public static void main(String[] args) {
        int n=5;

        //Pattern 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
