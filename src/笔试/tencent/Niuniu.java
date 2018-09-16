package 笔试.tencent;

import java.util.Scanner;

/**
 * @ClassName Niuniu
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/16 10:41
 */
public class Niuniu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[t][3];
        String[] res = new String[t];
        for (int i=0; i<t; i++) {
            for (int j=0; j<3; j++) {
                arr[i][j] = sc.nextInt();
            }
            res[i] = helper(arr[i]);
        }
        for (int i=0; i<t; i++) {
            System.out.println(res[i]);
        }
    }

    private static String helper(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        //int x = 0, y = 0;
        for (int x=0; x<101; x++) {
            for (int y=0; y<101; y++) {
                if(a*x == b*y+c)
                    return "YES";
            }
        }
        return "NO";
    }
}
