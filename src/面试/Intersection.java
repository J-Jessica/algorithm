package 面试;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Intersection
 * @Description 求两个有序数组的交集
 * 思路：
 * @Author jingpeipei
 * @Date 2018/9/16 16:51
 */
public class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {3, 6, 8, 9, 10};
        System.out.println(intersection(a, b));
    }
    private static List<Integer> intersection(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        int p = 0;
        int q = 0;
        while (p<a.length && 1<b.length) {
            if (a[p] < b[q])
                p++;
            else if(a[p] == b[q]) {
                res.add(a[p]);
                p++;
                q++;
            }else
                q++;
        }
        return res;
    }
}
