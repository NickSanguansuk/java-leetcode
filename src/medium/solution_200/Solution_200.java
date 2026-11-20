package medium.solution_200;

// 200. Number of Islands

public class Solution_200 {

    //static int dir[][] = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    //
    //public static boolean check(int x, int y, int n, int m) {
    //    return x >= 0 && y >= 0 && x < n && y < m;
    //}
    //
    //public static void dfs(char[][] grid, boolean[][] visited, int x, int y, int n, int m) {
    //    if (!check(x, y, n, m) || grid[x][y] == '0' || visited[x][y] == true) {
    //        return;
    //    }
    //    visited[x][y] = true;
    //    for (int i = 0; i < 4; i++) {
    //        int x1 = x+dir[i][0];
    //        int y1 = y+dir[i][1];
    //        dfs(grid, visited, x1, y1, n, m);
    //    }
    //}
    //
    //public int numIslands(char[][] grid) {
    //    int ans = 0;
    //    int n = grid.length;
    //    int m = grid[0].length;
    //    boolean visited[][] = new boolean[n][m];
    //    for (int i = 0; i < n; i++) {
    //        for (int j = 0; j < m; j++) {
    //            if (visited[i][j] == false && grid[i][j] == '1') {
    //                ans++;
    //                dfs(grid, visited, i, j, n, m);
    //            }
    //        }
    //    }
    //    return ans;
    //}

    // Time complexity      O(m*n)
    // Space complexity     O(m*n)

    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public int numIslands(char[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                dfs(grid, i, j);
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_200 solution = new Solution_200();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(solution.numIslands(grid1)); // 1

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid2)); // 3

    }
}
