package dfs;

import java.util.LinkedList;

/**
 * @ClassName DfsRatMaze
 * @Description DFS实现老鼠走迷宫
 * 小老鼠走进了格子迷宫，如何能绕过猫并以最短的路线吃到奶酪呢？
 * 注意只能上下左右移动，不能斜着移动。
 *
 * 思路：在解决迷宫问题上，深度优先算法的思路是沿着一条路一直走，遇到障碍或走出边界再返回尝试别的路径。
 * @Author jingpeipei
 * @Date 2018/8/21 11:14
 */
public class DfsRatMaze {

    int min = Integer.MAX_VALUE;
    int endX = 3;
    int endY = 3;
    int width = 5;
    int height = 4;

    int[][] maze = new int[5][4];
    int[][] mark = new int[5][4]; //标记是否走过
    LinkedList<Integer> map = new LinkedList<>(); //用一个栈记录路径

    public void dfs(int startX, int startY, int step) {
        int[][] next = new int[][] {
                {1,0},
                {0,1},
                {-1,0},
                {0,-1}
        };
        int nextX, nextY;
        int possible;
        if (startX == endX && startY == endY) {
            if (step < min) {
                min = step;
            }
            for (int i = map.size(); i >= 0; i -= 2) {
                nextX = map.get(i);
                nextY = map.get(i - 1);
                System.out.println("[");
            }
        }
    }

    public void initMaze() {
        this.maze[2][0] = 1;
        this.maze[1][2] = 1;
        this.maze[2][2] = 1;
        this.maze[3][2] = 1;
    }


}
