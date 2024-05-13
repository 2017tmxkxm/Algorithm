import java.util.*;

class Main {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exam = sc.nextLine();
        String[] str = exam.split("-");
        for(int i=0; i<str.length; i++) {
            int temp = mySum(str[i]);
            if(i==0) answer = answer + temp;
            else answer = answer - temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String a) {
        int sum = 0;
        String[] str = a.split("[+]");
        for(int i=0; i<str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }
}