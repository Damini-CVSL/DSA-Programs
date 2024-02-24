import java.util.Scanner;

class NumberCrownPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numberCrownPattern(n);
    }

    static void numberCrownPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int k=i; k>=1; k--){
                System.out.print(k);
            }

            System.out.println();
    
        }
        

        
    }
}