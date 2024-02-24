import java.util.Scanner;

class InvertedRightAngledNumberedTriangle{
    public static void main(String[] a){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        invertedRightAngledNumberedTriangled(n);
    }

    static void invertedRightAngledNumberedTriangled(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}