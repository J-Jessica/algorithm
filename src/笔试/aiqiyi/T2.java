package 笔试.aiqiyi;

import java.util.Scanner;

/**
 * @ClassName T2
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/15 10:51
 */

import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int num = Integer.parseInt(strs[1]);
            if (strs[0].equals("A")) {
                a[num - 1]++;
            } else
                a[num - 1]--;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[p - 1]) {
                res++;
            }
        }

        System.out.print(res);
    }

}
