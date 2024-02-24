import java.util.Scanner;

class InvertedRightAngledTriangled{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        invertedRightAngledTriangled(n);
    }

    static void invertedRightAngledTriangled(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}