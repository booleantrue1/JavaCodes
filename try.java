import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class j{
    
    public static int INF = Integer.MAX_VALUE / 10;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][][] dp;
    static int[][][][] trace;
    
    static class State {
        public int ptn;
        public int x, y;
        State(int p, int _x, int _y) {
            ptn = p;
            x = _x;
            y = _y;
        }
    }

    public static void main(String[] args) throws IOException {
//      System.out.println("14 14 7");
//      for (int n = 0 ; n < 14 ; n++) {
//          for (int m = 0 ; m < 14 ; m++) {
//              System.out.print(1 + " ");
//          }
//          System.out.println();
//      }
//      for (int k = 1 ; k <= 7 ; k++) {
//          System.out.println((k*2) + " " + (k*2));
//      }
        
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String[] data = s.readLine().split(" ");
        int n = Integer.valueOf(data[0]);
        int m = Integer.valueOf(data[1]);
        int k = Integer.valueOf(data[2]);
        
        
        int[][] table = new int[n+2][m+2];
        for (int i = 0 ; i < n ; i++) {
            String[] line = s.readLine().split(" ");
            for (int j = 0 ; j < m ; j++) {
                table[i+1][j+1] = Integer.valueOf(line[j]);
            }
        }
        
        int[][] sq = new int[k][2];
        for (int i = 0 ; i < k ; i++) {
            String[] line = s.readLine().split(" ");
            sq[i][0] = Integer.valueOf(line[0]);
            sq[i][1] = Integer.valueOf(line[1]);
        }
        
        dp = new int[1<<k][n+2][m+2];
        trace = new int[1<<k][n+2][m+2][];
        for (int i = 0 ; i < (1<<k) ; i++) {
            for (int j = 0 ; j < (n+2) ; j++) {
                Arrays.fill(dp[i][j], INF);
                
            }
        }
        
        for (int p = 0 ; p < k ; p++) {
            int x = sq[p][1];
            int y = sq[p][0];
            dp[1<<p][y][x] = table[y][x];
        }
        
        
        for (int ptn = 0 ; ptn < (1<<k) ; ptn++) {
            for (int ny = 1 ; ny <= n ; ny++) {
                for (int nx = 1 ; nx <= m ; nx++) {
                    for (int sptn = (ptn - 1) ; sptn > 0 ; sptn = ptn & (sptn - 1)) {
                        int sub1 = sptn;
                        int sub2 = ptn ^ sptn;
                        if (dp[sub1][ny][nx] >= INF || dp[sub2][ny][nx] >= INF) {
                            continue;
                        }
                        int newval = dp[sub1][ny][nx] + dp[sub2][ny][nx] - table[ny][nx];
                        if (dp[ptn][ny][nx] > newval) {
                            dp[ptn][ny][nx] = newval;
                            trace[ptn][ny][nx] = new int[]{0, sub1};
                        }
                    }
                }
            }
            
            
            boolean updated = true;
            while (updated) {
                updated = false;
                for (int ny = 1 ; ny <= n ; ny++) {
                    for (int nx = 1 ; nx <= m ; nx++) {
                        if (dp[ptn][ny][nx] < INF) {
                            for (int d = 0 ; d < 4 ; d++) {
                                int tx = nx + dx[d];
                                int ty = ny + dy[d];
                                if (table[ty][tx] > 0) {
                                    if (dp[ptn][ny][nx] + table[ty][tx] < dp[ptn][ty][tx]) {
                                        dp[ptn][ty][tx] = dp[ptn][ny][nx] + table[ty][tx];
                                        trace[ptn][ty][tx] = new int[]{1, d};
                                        updated = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        int ans = INF;
        int sx = 0;
        int sy = 0;
        int sptn = (1<<k)-1;
        for (int ny = 1 ; ny <= n ; ny++) {
            for (int nx = 1 ; nx <= m ; nx++) {
                ans = Math.min(ans, dp[(1<<k)-1][ny][nx]);
                if (ans == dp[(1<<k)-1][ny][nx]) {
                    sx = nx;
                    sy = ny;
                }
            }
        }
        
        boolean[][] destroyed = new boolean[n+2][m+2];
        
        Queue<State> q = new ArrayBlockingQueue<State>(300 * 512);
        q.add(new State(sptn, sx, sy));
        
        while (q.size() >= 1) {
            State stat = q.poll();
            destroyed[stat.y][stat.x] = true;
            
            int[] tr = trace[stat.ptn][stat.y][stat.x];
            if (tr == null) {
                continue;
            }

            if (tr[0] == 0) {
                int sub1 = tr[1];
                int sub2 = stat.ptn ^ sub1;
                q.add(new State(sub1, stat.x, stat.y));
                q.add(new State(sub2, stat.x, stat.y));
            } else {
                int d = tr[1];
                q.add(new State(stat.ptn, stat.x - dx[d], stat.y - dy[d]));
            }
        }
        
        System.out.println(ans);
        for (int ny = 1 ; ny <= n ; ny++) {
            for (int nx = 1 ; nx <= m ; nx++) {
                if (destroyed[ny][nx]) {
                    System.out.print('X');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
