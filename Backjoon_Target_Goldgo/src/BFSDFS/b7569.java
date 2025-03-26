package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b7569 {
	public static int[][][] graphs;
	public static boolean[][][] checks;
	public static int[][] moves = { { 1, 0, 0 }, { -1, 0, 0 }, { 0, 1, 0 }, { 0, -1, 0 }, { 0, 0, 1 }, { 0, 0, -1 } };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		graphs = new int[m][n][h];
		checks = new boolean[m][n][h];

		for (int k = 0; k < h; k++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < m; i++) {
					graphs[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}

		Queue<int[]> qu = new LinkedList<>();
		for (int k = 0; k < h; k++) {
		    for (int j = 0; j < n; j++) {
		        for (int i = 0; i < m; i++) {
		            if (graphs[i][j][k] == 1) {
		                qu.add(new int[]{i, j, k});
		                checks[i][j][k] = true;
		            }
		        }
		    }
		}
		bfs(qu);

		int result = -1;
		for (int k = 0; k < h; k++) {
			for (int j = 0; j < n; j++) {
				for (int i = 0; i < m; i++) {
					if (graphs[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					result = Math.max(result, graphs[i][j][k]);
				}
			}
		}

		System.out.println(result - 1);

	}

	public static void bfs(Queue<int[]> qu) {
		while (!qu.isEmpty()) {
			int[] now = qu.poll();
			int x = now[0];
			int y = now[1];
			int z = now[2];

			for (int i = 0; i < moves.length; i++) {
				int nx = x + moves[i][0];
				int ny = y + moves[i][1];
				int nz = z + moves[i][2];

				if (nx >= 0 && nx < graphs.length && ny >= 0 && ny < graphs[0].length && nz >= 0 && nz < graphs[0][0].length) {
					if (!checks[nx][ny][nz] && graphs[nx][ny][nz] == 0) {
						graphs[nx][ny][nz] = graphs[x][y][z] + 1;
						checks[nx][ny][nz] = true;
						qu.add(new int[] { nx, ny, nz });
					}
				}
			}
		}
	}

}
