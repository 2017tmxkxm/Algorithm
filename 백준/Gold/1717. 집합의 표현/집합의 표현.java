import java.util.Scanner;

class Main {
    static int parent[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N+1];

        // 대표 노드를 자기 자신으로 초기화
        for(int i=0; i<N+1; i++) {
            parent[i] = i;
        }

        for(int i=0; i<M; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // union 연산
            if(question == 0){
                union(a, b);
            } else{ // 두 원소 같은지 확인
                boolean result = checkSame(a, b);
                if(result) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

    // union 연산
    private static void union(int a, int b) {
        // 대표 노드 찾아서 연결하기
        a = find(a);
        b = find(b);
        if(a != b) {
            parent[b] = a;
        }
    }

    // find 연산
    private static int find(int a) {
        // index 값과 value 확인 -> 같다면 대표노드
        if(a == parent[a]) return a;
        else {
            // value를 index로 바꿔서 다시 find 호출
            return parent[a] = find(parent[a]);
        }
    }

    // checkSame -> 두 원소가 같은 집합인지 확인
    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b) return true;
        return false;
    }
}