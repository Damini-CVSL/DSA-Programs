import java.util.Scanner;

class HalfDimondRightSidePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        halfDimondRightSidePattern(n);
    }

    static void halfDimondRightSidePattern(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}