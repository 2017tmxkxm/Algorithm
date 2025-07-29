import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char[] find = sc.nextLine().toCharArray();

        int count = 0;
        int start_index = 0;
        for(int i=0; i<str.length && start_index < str.length;) {
            start_index = i;
            boolean match = true;
            for(int j=0; j<find.length;) {
                if(str[start_index] != find[j]) {
                    i++;
                    j=0;
                    match = false;
                    break;
                }else {
                    start_index++;
                    j++;
                }
                if(start_index >= str.length && j<find.length) {
                    match = false;
                    break;
                }
            }
            if(match) {
                count++;
                i = start_index;
            }
        }
        System.out.println(count);
    }
}
