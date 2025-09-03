import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        ArrayList<String> A = new ArrayList<>();

        for(int i=0; i<S.length; i++) {
            String temp = "";
            for(int j=i; j<S.length; j++) {
                temp += (String.valueOf(S[j]));
            }

            A.add(temp);
        }

        Collections.sort(A);

        for(int i=0; i<A.size(); i++) {
            System.out.println(A.get(i));
        }
    }
}
