package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1697 {
	static int[] move = { 1, -1, 2 };
	static boolean[] visited;
	static int n, m;
	static int[] result;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		visited = new boolean[100001];
		result = new int[100001];

		System.out.print(bfs(n));
	}

	static int bfs(int x) {
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(x);
		visited[x] = true;

		while (!qu.isEmpty()) {
			int mx = qu.poll();
			int nx = 0;
			if (mx == m) {
				return result[mx];
			}

			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					nx = mx + move[i];
				} else if (i == 1) {
					nx = mx + move[i];
				} else if (i == 2) {
					nx = mx * move[i];
				}
				if (nx >= 0 && nx <= 100000 && !visited[nx]) {
					qu.offer(nx);
					visited[nx] = true;
					result[nx] = result[mx] + 1;
				}
			}

		}
		return -1;
	}
}
