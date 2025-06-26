import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.next().toCharArray();

        int[] num = new int[11];

        for(int i=0; i<charArray.length; i++) {
            int temp = Integer.parseInt(String.valueOf(charArray[i]));

            if(temp == 6 || temp == 9) {
                if(num[temp] == 0) num[temp]++;
                else if(num[temp]!=0 && num[9]==0) num[9]++;
                else if(num[temp]!=0 && num[6]==0) num[6]++;
                else if(num[temp]!=0 && num[6] < num[temp]) num[6]++;
                else if(num[temp]!=0 && num[9] < num[temp]) num[9]++;
                else num[temp]++;
            } else {
                num[temp]++;
            }
        }

        Arrays.sort(num);

        System.out.println(num[num.length-1]);


    }
}
