package 笔试;

import java.util.*;

/**
 * @ClassName Main
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/9 20:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] res = new String[T];
        for (int i=0; i<T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][];
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int j=0; j<M; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (map.containsKey(a-1))
                    map.get(a-1).add(b-1);
                else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(b-1);
                    map.put(a-1, list);
                }
            }
            for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                int key = entry.getKey();
                ArrayList<Integer> list = entry.getValue();
                int[] nodes = new int[list.size()];
                for (int k=0; k<list.size(); k++) {
                    nodes[k] = list.get(k);
                }
                arr[key] = nodes;
            }
            res[i] = helper(arr);
        }
        for (int i=0; i<T; i++) {
            System.out.println(res[i]);
        }
    }

    private static String helper(int[][] g) {
        int[] colors = new int[g.length];
        for (int i = 0; i < g.length; i++)
            if (colors[i] == 0) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                colors[i] = 1;
                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    for (int adjacent : g[node])
                        if (colors[adjacent] == colors[node])
                            return "No";
                        else if (colors[adjacent] == 0) {
                            q.add(adjacent);
                            colors[adjacent] = -colors[node];
                        }
                }
            }
        return "Yes";
    }
}
