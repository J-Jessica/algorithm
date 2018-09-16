import java.util.*;

/**
 * @ClassName Graph
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/6 20:42
 */
public class Graph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] graph = new int[n][];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for (int i=0; i<n-1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (map.containsKey(x))
                map.get(x).add(y);
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(x, list);
            }
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            int key = entry.getKey();
            ArrayList<Integer> list = entry.getValue();
            int[] arr = new int[list.size()];
            for(int i = 0; i < list.size();i++){
                arr[i] = list.get(i) - 1;
            }
            graph[key-1] = arr;
        }
        int res = shortestPathLength(graph);
        System.out.println(res);
    }

    public static int shortestPathLength(int[][] graph) {
        int N = graph.length, mask = 1, count = 0;
        Set<String> set = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            mask |= (1 << i);
            int[] make = new int[] {(1<<i),i};
            set.add(make[0] + "+" + make[1]);
            q.offer(make);
        }
        while (true) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] curr = q.poll();
                if (curr[0] == mask) return count;
                for (int next : graph[curr[1]]) {
                    int nextPath = curr[0] | (1 << next);
                    if (!set.add(nextPath + "+" + next)) continue;
                    q.offer(new int[]{nextPath,next});
                }
            }
            count++;
        }
    }
}
