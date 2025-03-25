package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b10026 {
	public static int[][] move = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static boolean[][] visited;
	public static int num;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		int normalcount = 0;
		int rgcount = 0;
		String[][] strs = new String[num][num];
		String[][] rgstrs = new String[num][num];

		for (int i = 0; i < num; i++) { // 그래프 초기화
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				strs[i][j] = String.valueOf(str.charAt(j));

				if (str.charAt(j) == 'R') {
					rgstrs[i][j] = "G";
				} else {
					rgstrs[i][j] = String.valueOf(str.charAt(j));
				}
			}
		}
		visited = new boolean[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (!visited[i][j]) {
					normalcount++;
					bfs(i, j, strs);
				}
			}
		}

		visited = new boolean[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (!visited[i][j]) {
					rgcount++;
					bfs(i, j, rgstrs);
				}
			}
		}

		System.out.print(normalcount + " " + rgcount);
	}

	static void bfs(int a, int b, String[][] arr) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] { a, b });
		visited[a][b] = true;

		while (!qu.isEmpty()) {
			int[] now = qu.poll();
			int x = now[0];
			int y = now[1];
			String checkcolor = arr[x][y];

			for (int i = 0; i < move.length; i++) {
				int nx = x + move[i][0];
				int ny = y + move[i][1];

				if (nx >= 0 && nx < num && ny >= 0 && ny < num && !visited[nx][ny] && checkcolor.equals(arr[nx][ny])) {
					visited[nx][ny] = true;
					qu.add(new int[] { nx, ny });
				}
			}
		}
	}

}
