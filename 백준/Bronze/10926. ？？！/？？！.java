import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        
        wr.write(input[0] + "??!");
        
        wr.flush();
        wr.close();
        
    }
}