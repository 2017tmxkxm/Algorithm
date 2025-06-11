public class Main {
    public static void main(String[] args) {
        boolean check[] = new boolean[10001];
        for(int i=1; i<10000; i++) {
            int s = i;

            // 각 자리수 숫자 더하는 로직
            char[] temp = String.valueOf(i).toCharArray();
            for(int j=0; j<temp.length; j++) {
                s+=Integer.parseInt(String.valueOf(temp[j]));
            }

            if(s < 10001) {
                check[s] = true;
            }
        }

        for(int i=1; i<=10000; i++) {
            if(!check[i]) System.out.println(i);
        }
    }
}
