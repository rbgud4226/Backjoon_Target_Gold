package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b21736 {
	public static int[][] move = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static boolean[][] check;
	public static String[][] map;
	public static int n, m;
	public static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new String[n][m];
		check = new boolean[n][m];
		int start = 0;
		int end = 0;
		for (int i = 0; i < n; i++) { // 지도 초기화
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				char p  = s.charAt(j); 
				if(String.valueOf(p).equals("I")) {
					start = i;
					end = j;
				}
				map[i][j] = String.valueOf(p);
				check[i][j] = false;
			}
		}
		
		bfs(start, end);
		if(count == 0) {
			System.out.print("TT");
		}else {
			System.out.print(count);
		}
	}

	public static void bfs(int x, int y) {
		Queue<int[]> qu = new LinkedList<>();
		int[] xypoint = new int[] {x,y};
		qu.add(xypoint);
		check[x][y] = true;
		
		while(!qu.isEmpty()) {
			int[] now = qu.poll();
			int nx = now[0];
			int ny = now[1];
			
			for(int i=0; i<move.length; i++) {
				int nnx = nx + move[i][0];
				int nny = ny + move[i][1];
				
				if(nnx >=0 && nnx < n && nny >= 0 && nny < m && !check[nnx][nny] && !map[nnx][nny].equals("X")) {
					check[nnx][nny] = true;
					qu.add(new int[] {nnx, nny});
					
					if(map[nnx][nny].equals("P")) {
						count++;
					}
				}
			}
		}
	}

}
