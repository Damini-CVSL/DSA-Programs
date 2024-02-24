import java.util.Scanner;

class IncreasingNumberedTrianglePattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        increasingNumberedTrianglePattern(n);
    }

    static void increasingNumberedTrianglePattern(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count = count + 1);
            }
            System.out.println();
        }
    }
}
