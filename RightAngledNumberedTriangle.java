import java.util.Scanner;

class RightAngledNumberedTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        rightAngledNumberedTriangle(p);
    }

    static void rightAngledNumberedTriangle(int p){

        for(int i=1; i<p; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}