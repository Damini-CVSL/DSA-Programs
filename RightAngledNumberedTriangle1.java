import java.util.Scanner;

class RightAngledNumberedTriangle1{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();

        rightAngledNumberedTriangle1(a);
    }

    static void rightAngledNumberedTriangle1(int a){
        for(int i=1; i<a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}