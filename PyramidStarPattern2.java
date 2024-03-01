import java.util.Scanner;

class PyramidStarPattern2{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pyramidStarPattern2(n);
    }

    static void pyramidStarPattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<i; k++){
                System.out.print("*");
            }
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
            }
    }
}

