package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b2178 {
	static int[][] miro;
	static int[][] move = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static boolean[][] visited;
	static int n, m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		miro = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String k = br.readLine();
			for (int j = 0; j < m; j++) {
				miro[i][j] = Integer.parseInt(String.valueOf(k.charAt(j))); // 1,0을 미로에 넣음
			}
		}
		System.out.println(bfs(0, 0));
	}

	static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cx = cur[0];
			int cy = cur[1];
			if (cx == n - 1 && cy == m - 1) {
				return miro[cx][cy];
			}
			for (int[] d : move) {
				int nx = cx + d[0];
				int ny = cy + d[1];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (!visited[nx][ny] && miro[nx][ny] == 1) {
						visited[nx][ny] = true;
						miro[nx][ny] = miro[cx][cy] + 1;
						queue.offer(new int[] { nx, ny });
					}
				}
			}
		}
		return -1;
	}

}
