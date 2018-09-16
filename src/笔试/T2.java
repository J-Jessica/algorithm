package 笔试;

import java.util.Scanner;

/**
 * @ClassName T2
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/9 10:41
 */
public class T2 {
    public static void bfs(int[][] grid, int i, int j)
    {
        if (i<0 || i>grid.length - 1 || j<0 || j>grid[0].length - 1 || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        bfs(grid, i - 1, j);
        bfs(grid, i + 1, j);
        bfs(grid, i, j - 1);
        bfs(grid, i, j + 1);
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int[][] grid = new int[M][M];

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < M; j++)
            {
                grid[i][j] = in.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (grid[i][j] == 1)
                {
                    bfs(grid, i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}


