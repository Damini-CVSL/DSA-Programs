import java.util.Scanner;

class IncreasingLetterTrianglePattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        increasingLetterTrianglePattern(n);
    }

    static void increasingLetterTrianglePattern(int n){
        for(int i=1; i<=n; i++){
            for(char ch = 'A'; ch < 'A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}