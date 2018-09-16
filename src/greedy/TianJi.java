package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TianJi
 * @Description 田忌赛马
 * @Author jingpeipei
 * @Date 2018/8/29 15:29
 */
public class TianJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tj = new int[n];
        int[] king = new int[n];
        for (int i = 0; i < n; i++) {
            tj[i] = sc.nextInt();
        }
        for (int i = 0; i< n; i++) {
            king[i] = sc.nextInt();
        }
        Arrays.sort(tj);
        Arrays.sort(king);
        System.out.println(helper(tj, king, n));
    }

    public static int helper(int[] tj, int[] king, int n) {
        int money=0, count=0;
        int tj_low = 0;
        int king_low = 0;
        int tj_fast = n-1;
        int king_fast = n-1;
        while (count < n) {
            if (tj[tj_fast] > king[king_fast]) {
                money += 200;
                tj_fast--;
                king_fast--;
                count++;

            }else if (tj[tj_fast] < king[king_fast]) {
                money -= 200;
                tj_low++;
                king_fast--;
                count++;
            } else {
                if (tj[tj_low] > king[king_low]) {
                    money += 200;
                    tj_low++;
                    king_low++;
                    count++;
                } else {
                    if (tj[tj_low] == tj[tj_fast]) {
                        return 0;
                    }
                    money -= 200;
                    tj_low++;
                    king_fast--;
                    count++;
                }
            }
        }
        return money;
    }
}
