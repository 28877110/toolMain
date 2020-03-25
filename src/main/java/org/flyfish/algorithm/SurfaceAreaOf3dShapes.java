package org.flyfish.algorithm;

/**
 * @Classname SurfaceAreaOf3dShapes
 * @Description https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
 * @Date 2020-03-25 19:50
 * @Created by smallfish
 */
public class SurfaceAreaOf3dShapes {
    public int surfaceArea(int[][] grid) {
        /**
         *
         * 功能描述:在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
         *
         * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
         *
         * 请你返回最终形体的表面积。
         *
         * @param: [grid]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-25 19:50
         */
        //代表四个方向
        int[] dir1 = new int[]{1, -1, 0, 0};
        int[] dir2 = new int[]{0, 0, 1, -1};

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    for (int k = 0; k < 4; k++) {
                        int tem = 0;
                        if(i+dir1[k]>=0 && j+dir2[k]>=0 && i+dir1[k]<grid.length && dir2[k]+j <grid.length){
                            tem = grid[i+dir1[k]][j+dir2[k]];
                        }
                        //和上下左右相邻的高度差
                        result+=Math.max(grid[i][j]-tem,0);
                    }
                    //上下2面
                    result+=2;

                }
            }
        }
        return result;
    }
}
