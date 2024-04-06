import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        
        System.out.println(n1 * n2);
        
        
    }
}