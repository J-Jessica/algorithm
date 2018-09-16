import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName T2
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/6 20:13
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(help(a, n, k, t));
        scanner.close();
    }

    public static int help(int[] a, int n, int k, int t) {
        int res = 0;
        //HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - k + 1; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                if (map.containsKey(a[j])) {
                    int count = map.get(a[j]);
                    if (count + 1 == t) {
                        res++;
                        break;
                    }
                    map.put(a[j], count + 1);
                } else
                    map.put(a[j], 1);
            }
        }
        return res;
    }
}
