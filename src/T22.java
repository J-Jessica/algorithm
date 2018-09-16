import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName T22
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/7 19:59
 */
public class T22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int minx =Integer.MAX_VALUE, miny = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            minx = x1<minx ? x1 : minx;
            maxx = x1>maxx ? x1 : maxx;
            miny = y1<miny ? y1 : miny;
            maxy = y1>maxy ? y1 : maxy;
            map.put(x1, y1);
        }
        if(x < minx || x > maxx || y < miny || y > maxy)

        {

            System.out.print("no,1");

        }
        int n = map.size();
        int[] xs = new int[n];
        int[] ys = new int[n];
        int i=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            xs[i] = key;
            ys[i] = value;
            i++;
        }

        Set<Integer> keys = map.keySet();
        System.out.println("no,2");
    }

    public static int help(HashMap<Integer, Integer> map, int x, int y) {
        return 1;
    }
}
