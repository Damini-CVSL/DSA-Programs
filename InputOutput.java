import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class InputOutput{
    public static void main(String[] a) throws IOException{
        System.out.println("Enter Input : ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        int num = Integer.parseInt(bf.readLine());
        System.out.println("number : "+num);
    }
}
