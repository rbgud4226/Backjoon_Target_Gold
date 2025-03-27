package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b7576 {
	public static int[][] moves = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	public static boolean[][] checks;
	public static int[][] graphs;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		checks = new boolean[n][m];
		graphs = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				graphs[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Queue<int[]> qu = new LinkedList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graphs[i][j] == 1) { 
					qu.add(new int[] {i,j});
				}
			}
		}
		bfs(qu);
		
		int count = -1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graphs[i][j] == 0) {
					System.out.print(-1);
					return;
				}
				
				count = Math.max(count, graphs[i][j]);
			}
		}
		
		System.out.println(count - 1);
		
	}
	
	
	public static void bfs(Queue<int[]> qu) {		
		while(!qu.isEmpty()) {
			int[] now = qu.poll();
			int x = now[0];
			int y = now[1];
			
			for(int i=0; i<moves.length; i++) {
				int nx = x + moves[i][0];
				int ny = y + moves[i][1];
				
				if(nx >=0 && nx < graphs.length && ny >= 0 && ny < graphs[0].length) {
					if(!checks[nx][ny] && graphs[nx][ny] == 0) {
						graphs[nx][ny] = graphs[x][y] + 1;
						checks[nx][ny] = true;
						qu.add(new int[] {nx, ny});
					}
				}
			}
		}
	}

}
