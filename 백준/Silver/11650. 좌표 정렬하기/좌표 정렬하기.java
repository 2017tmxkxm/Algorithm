import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Point> points = new ArrayList<>();

        for(int i=0; i<N; i++) {
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(points);

        for (Point now : points) {
            System.out.println(now.x + " " + now.y);
        }
    }
}

class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
