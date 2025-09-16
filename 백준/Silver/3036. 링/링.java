import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[0]%arr[i] == 0) {
                System.out.println(arr[0]/arr[i] + "/" + 1);
            }else {
                int gcd = gcd3036(arr[0], arr[i]);
                System.out.println(arr[0]/gcd + "/" + arr[i]/gcd);
            }
        }
    }

    private static int gcd3036(int a, int b) {
        if(a%b==0) return b;
        return gcd3036(b, a%b);
    }
}
