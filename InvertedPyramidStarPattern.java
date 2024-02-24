import java.util.Scanner;

class InvertedPyramidStarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        invertedPyramidStarPattern(n);
    }

    static void invertedPyramidStarPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }

            for(int k=n; k>i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}