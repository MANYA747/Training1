package DAY3;

public class invertedpyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i1 =0;i1<=n;i1++){
            for(int j1=0;j1<=n-i1;j1++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
