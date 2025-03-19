package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class b2667 {
	public static int[][] moves = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static int[][] maps;
	public static boolean[][] check;
	public static int num;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		maps = new int[num][num];
		check = new boolean[num][num];

		for (int i = 0; i < num; i++) {
			String oneLine = br.readLine();
			for (int j = 0; j < num; j++) {
				maps[i][j] = Integer.parseInt(String.valueOf(oneLine.charAt(j)));
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (maps[i][j] == 1 && !check[i][j]) {
					list.add(bfs(i, j));
				}
			}
		}

		list.sort((a, b) -> {
			return a - b;
		});
		System.out.println(list.size());
		for (int a : list) {
			System.out.println(a);
		}

	}

	public static int bfs(int x, int y) {
		int count = 1;
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] { x, y });
		check[x][y] = true;

		while (!qu.isEmpty()) {
			int[] now = qu.poll();
			int nx = now[0];
			int ny = now[1];

			for (int i = 0; i < moves.length; i++) {
				int nnx = nx + moves[i][0];
				int nny = ny + moves[i][1];

				if (nnx >= 0 && nnx < num && nny >= 0 && nny < num && !check[nnx][nny] && maps[nnx][nny] == 1) {
					qu.add(new int[] { nnx, nny });
					check[nnx][nny] = true;
					count++;
				}
			}
		}
		return count;
	}

}
