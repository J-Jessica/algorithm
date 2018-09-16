package 笔试.dianxin;

/**
 * @ClassName T3
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/14 20:11
 */
import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LRUCache lru = new LRUCache(n);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i=0; i<k; i++){
            String s = sc.nextLine();
            while(s == null || s.equals(""))
                s = sc.nextLine();
            String[] operation = s.split("\\s+");
            String op = operation[0];
            if (op.equals("put")) {
                int key = Integer.parseInt(operation[1]);
                int value = Integer.parseInt(operation[2]);
                lru.put(key, value);
            } else {
                int key = Integer.parseInt(operation[1]);
                int value = lru.get(key);
                res.add(value);
            }

        }
        for(int i=0; i<res.size(); i++)
            System.out.print(res.get(i)+" ");
        sc.close();

    }
}
class LRUCache {
    private LinkedHashMap<Integer, Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        int value = cache.getOrDefault(key, -1);
        cache.remove(key);

        if(value != -1){
            cache.put(key, value);
        }
        return value;
    }

    public void put(int key, int value) {
        if(get(key) ==-1 && cache.size() >= capacity){
            int lastKey = cache.keySet().iterator().next();
            cache.remove(lastKey);
        }
        cache.put(key, value);
    }
}