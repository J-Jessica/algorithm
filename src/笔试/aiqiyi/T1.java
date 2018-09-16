package 笔试.aiqiyi;

import java.util.*;

/**
 * @ClassName T1
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/15 11:24
 */

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(helper(arr));
    }

    public static int helper(int[] arr){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += arr[i];
            sum2 += arr[5 - i];
        }
        int diff = 0;
        List<Integer> list = new ArrayList<>();
        if(sum1 >= sum2){
            diff = sum1-sum2;
            for (int i = 0; i < 3; i++) {
                list.add(arr[i]);
            }
            for (int i = 3; i < 6; i++) {
                list.add(9 - arr[i]);
            }
        }else{
            diff = sum2 - sum1;
            for (int i = 0; i < 3; i++) {
                list.add(9 - arr[i]);
            }
            for (int i = 3; i < 6; i++) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        int sum = 0;
        int i = 5;
        for ( ; i >= 0; i--) {
            if (sum >= diff)
                break;
            sum += list.get(i);
        }
        return (5-i);
    }
}
