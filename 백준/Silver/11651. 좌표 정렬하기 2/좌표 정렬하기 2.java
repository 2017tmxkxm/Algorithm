import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Point11651> array = new ArrayList<>();

        for(int i=0; i<N; i++) {
            array.add(new Point11651(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(array);

        for(Point11651 temp : array) {
            System.out.println(temp.x + " " + temp.y);
        }
    }
}

class Point11651 implements Comparable<Point11651> {
    int x;
    int y;

    public Point11651(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point11651 o) {
        if(o.y == this.y) {
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}
