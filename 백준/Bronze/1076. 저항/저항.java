import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long[] V = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        String Vstr = "";
        for(int i=0; i<2; i++) {
            String temp = sc.nextLine();
            for(int j=0; j<color.length; j++) {
                if(temp.equals(color[j])) {
                    Vstr = Vstr + String.valueOf(j);
                    break;
                }
            }
        }

        String temp = sc.nextLine();
        for(int j=0; j< color.length; j++) {
            if(temp.equals(color[j])) {
                System.out.println(Long.parseLong(Vstr)*V[j]);
            }
        }

    }
}