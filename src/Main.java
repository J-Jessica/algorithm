import java.util.*;

/**
 * @ClassName Main
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/8/30 19:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        helper(a, b);
    }

    public static void helper(int a, int b) {
        List t = new ArrayList();  //余数

        int p = - 1;//循环节的起始位置
        while(true){

            int x = a % b;
            if(x == 0) break;

            p = t.indexOf(x);

            if(p >= 0) break;
            else
                t.add(x);

            a = x*10;
        }
        if (p == -1) {
            System.out.print(t.size()+" ");
            System.out.print(0);
        } else {
            System.out.print(p+" ");
            System.out.print(t.size()-p);
        }

        /*System.out.print(t1.get(0)+".");

        for(int i = 1; i < t1.size();i++){

            if(i == p + 1)System.out.print("[");
            System.out.print(t1.get(i));
        }
        if(p >= 0)
            System.out.println("]");*/
    }
}
