import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] temp = sc.nextLine().toCharArray();

        int result = 0;

        for(int i=temp.length-1; i>=0; i--) {
            char now = temp[i];
            int index = (int)Math.pow(16, temp.length-1-i);
            if(now >= 'A') {
                result += (now-55) * index;
            }else {
                result += (now - '0') * index;
            }
        }

        System.out.println(result);

    }
}
