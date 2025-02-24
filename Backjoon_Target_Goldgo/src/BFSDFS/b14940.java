package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b14940 {
	static int[][] maps;
	static boolean[][] visited;
	static int[][] move = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static int targetx;
	static int targety;
	static int n, m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		maps = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				maps[i][j] = Integer.parseInt(st.nextToken());
				if (maps[i][j] == 2) {
					targetx = i;
					targety = j;
				}
			}
		}

		bfs(targetx, targety);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(maps[i][j] == 0) {
					System.out.print("0" + " ");
				}else if(!visited[i][j]) {
					System.out.print("-1" + " ");
				}else {
					System.out.print(maps[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	static int bfs(int x, int y) {
		Queue<int[]> qu = new LinkedList<>();
		qu.offer(new int[] { x, y });
		visited[x][y] = true;
		maps[x][y] = 0; // 처음에 목표부터 시작하니까 거리는 0에서 시작

		while (!qu.isEmpty()) {
			int[] s = qu.poll();
			int cx = s[0];
			int cy = s[1];

			for (int[] mo : move) {
				int mx = cx + mo[0];
				int my = cy + mo[1];

				if (mx >= 0 && my >= 0 && mx < n && my < m) {
					if (!visited[mx][my] && (maps[mx][my] == 1 || maps[mx][my] == 2)) {
						visited[mx][my] = true;
						maps[mx][my] = maps[cx][cy] + 1;
						qu.offer(new int[] { mx, my });
					}
				}
			}

		}

		return -1;
	}

}
