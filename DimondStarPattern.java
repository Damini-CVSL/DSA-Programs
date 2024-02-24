import java.util.Scanner;

class DimondStarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dimondStarPattern(n);
    }

    static void dimondStarPattern(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

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