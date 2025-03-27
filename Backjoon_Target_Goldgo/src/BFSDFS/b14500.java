package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14500 {
	public static int[][] graphs;
	public static int[][] moves = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static boolean[][] checks;
	public static int maxsum = 0;
	public static int n, m;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken()); // 세로
		m = Integer.parseInt(st.nextToken()); // 가로
		graphs = new int[n][m];
		checks = new boolean[n][m];

		for (int i = 0; i < n; i++) { // 그래프 요소삽입
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				graphs[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				checks[i][j] = true;
				dfs(i, j, 1, graphs[i][j]);
				checks[i][j] = false;
				dfs2(i, j);
			}
		}
		
		System.out.println(maxsum);

	}

	public static void dfs(int a, int b, int depth, int sum) {
		if (depth == 4) {
			maxsum = Math.max(maxsum, sum);
			return;
		}

		for (int i = 0; i < moves.length; i++) {
			int nx = a + moves[i][0];
			int ny = b + moves[i][1];

			if (nx >= 0 && nx < n && ny >= 0 && ny < m && !checks[nx][ny]) {
				checks[nx][ny] = true;
				dfs(nx, ny, depth + 1, sum + graphs[nx][ny]);
				checks[nx][ny] = false;
			}
		}
	}

	public static void dfs2(int a, int b) {
		int sum = graphs[a][b];
		int count = 0;
		int min = Integer.MAX_VALUE; // 블록 중 작은 값

		for (int i = 0; i < moves.length; i++) {
			int nx = a + moves[i][0];
			int ny = b + moves[i][1];

			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				sum += graphs[nx][ny];
				min = Math.min(min, graphs[nx][ny]);
				count++;
			}
		}
		if (count == 4) {
			sum -= min;
		}
		if (count >= 3) {
			maxsum = Math.max(maxsum, sum);
		}
	}

}
