import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int P = 0;
            int S = 0;
            String s = sc.next();
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) == '(') {
                    P++;
                }else if(s.charAt(j) == ')'){
                    S++;
                    if(P < S) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if (P == S && P != 0) {
                System.out.println("YES");
            }else if(P>S) {
                System.out.println("NO");
            }
        }
    }
}
