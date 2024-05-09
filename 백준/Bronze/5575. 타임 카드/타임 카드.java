import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            int sh = sc.nextInt();
            int sm = sc.nextInt();
            int ss = sc.nextInt();
            int eh = sc.nextInt();
            int em = sc.nextInt();
            int es = sc.nextInt();

            if(ss > es) {
                es += 60;
                em --;
            }
            es-=ss;

            if(sm > em) {
                em += 60;
                eh --;
            }
            em-=sm;
            eh-=sh;

            System.out.println(eh + " " + em + " " + es);
        }
    }
}