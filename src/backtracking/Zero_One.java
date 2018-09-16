package backtracking;

/**
 * @ClassName Zero_One
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/8/21 10:12
 */
public class Zero_One {
    private static int[] p; //物品的价值数组
    private static int[] w; //物品的重量数组
    private static int c; //最大可以拿的重量
    private static int count; //物品的个数

    private static int cw; //当前的重量
    private static int cp; //当前的价值
    static int bestp; //目前最优装载的价值
    private static int r; //剩余物品的价值

    private static int[] cx; // 存放当前解
    private static int[] bestx; //存放最终解

    public static int loading(int[] ww, int[] pp, int cc) {
        //初始化数据成员，数组下标从1开始
        count = ww.length - 1;
        w = ww;
        p = pp;
        c = cc;
        cw = 0;
        bestp = 0;
        cx = new int[count + 1];
        bestx = new int[count + 1];

        //初始化r，即剩余最大价格
        for (int i = 1; i <= count; i++) {
            r += p[i];
        }

        //调用回溯计算
        backtracking(1);
        return bestp;
    }

    public static void backtracking(int t) {
        if (t > count) {//到达叶节点
            if (cp > bestp) {
                for (int i = 1; i <= count; i++) {
                    bestx[i] = cx[i];
                }

                bestp = cp;
            }
            return;
        }
        r -= p[t];
        if (cw + w[t] <= c) {
            cx[t] = 1;
            cp += p[t];
            cw += w[t];
            backtracking(t+1);
            cp -= p[t];
            cw -= w[t];
        }
    }
}
