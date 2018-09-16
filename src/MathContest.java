import java.util.Scanner;

public class MathContest {
    static int[][] maxValue;
    static int[] score;
    static int[] time;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        score = new int[num];
        time = new int[num];
        for (int i = 0; i < num; i++) {
            score[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            time[i] = scanner.nextInt();
        }
        int totalTime = scanner.nextInt();
        maxValue = new int[totalTime+1][num];
        for (int i = 0; i < totalTime+1; i++)
            for (int j = 0; j < num; j++) {
                maxValue[i][j] = -1;
            }
        System.out.println(getScore(totalTime, num-1));
    }
    public static int getScore(int totalTime, int count) {
        int mValue;
        // 不等于-1 表示已经计算过。直接取值
        if (maxValue[totalTime][count] != -1) {
            mValue = maxValue[totalTime][count];
        } else if (count == 0) { // 放进第一个物体;
            if (totalTime > time[0]) {
                mValue = score[0];
            } else {
                mValue = 0;
            }
        } else if (totalTime >= time[count]) {

            if (getScore(totalTime - time[count], count - 1) + score[count] > getScore(totalTime, count - 1)) {
                mValue = getScore(totalTime - time[count], count - 1) + score[count];
            } else {
                mValue = getScore(totalTime, count - 1);
            }

        } else {
            mValue = getScore(totalTime, count - 1);
        }
        maxValue[totalTime][count] = mValue;
        return mValue;

    }
}