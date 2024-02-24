

import java.util.Scanner;

class RightAngledTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        rightAngledTriangle(n);
    }

    static void rightAngledTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}