import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; i++) {
            if(str.contains(a[i])) {
                int num = str.indexOf(a[i]);
                sb.append(num).append(" ");
            } else {
                sb.append("-1").append(" ");
            }
        }

        System.out.println(sb);

    }
}