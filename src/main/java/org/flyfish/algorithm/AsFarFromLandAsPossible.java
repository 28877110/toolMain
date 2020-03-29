package org.flyfish.algorithm;

/**
 * @Classname AsFarFromLandAsPossible
 * @Description https://leetcode-cn.com/problems/as-far-from-land-as-possible/
 * @Date 2020-03-29 14:28
 * @Created by smallfish
 */
public class AsFarFromLandAsPossible {

    public int maxDistance(int[][] grid) {
        /**
         *
         * 功能描述:你现在手里有一份大小为 N x N 的『地图』（网格） grid，上面的每个『区域』（单元格）都用 0 和 1 标记好了。其中 0 代表海洋，1 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。
         *
         * 我们这里说的距离是『曼哈顿距离』（ Manhattan Distance）：(x0, y0) 和 (x1, y1) 这两个区域之间的距离是 |x0 - x1| + |y0 - y1| 。
         *
         * 如果我们的地图上只有陆地或者海洋，请返回 -1。
         *
         * @param: [grid]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-29 14:29
         */
        if (grid.length < 2) {
            return -1;
        }
        int result = -1;

        //初始化tem
        int[][] tem = new int[grid.length][grid[0].length];
        for (int i = 0; i < tem.length; i++) {
            for (int i1 = 0; i1 < tem[0].length; i1++) {
                if (grid[i][i1] == 1) {
                    tem[i][i1] = 0;
                } else {
                    tem[i][i1] = 400;
                }
            }
        }

        //左上到右下
        for (int i = 0; i < tem.length; i++) {
            for (int j = 0; j < tem[0].length; j++) {
                if (i - 1 >= 0) {
                    tem[i][j] = Math.min(tem[i - 1][j] + 1, tem[i][j]);
                }
                if (j - 1 >= 0) {
                    tem[i][j] = Math.min(tem[i][j - 1] + 1, tem[i][j]);
                }
            }
        }

        //右下到左上
        for (int i = tem.length - 1; i >= 0; i--) {
            for (int j = tem[i].length - 1; j >= 0; j--) {
                if (i + 1 < tem.length) {
                    tem[i][j] = Math.min(tem[i + 1][j] + 1, tem[i][j]);
                }
                if (j + 1 < tem.length) {
                    tem[i][j] = Math.min(tem[i][j + 1] + 1, tem[i][j]);
                }
            }
        }

        for (int i = 0; i < tem.length; i++) {
            for (int j = 0; j < tem[i].length; j++) {
                if (tem[i][j] != 0) {
                    result = Math.max(tem[i][j], result);
                }
            }
        }

        if (result == 400) {
            return -1;
        }

        return result;

    }

}
