package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2606 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int linkednum = Integer.parseInt(br.readLine());

		graph = new ArrayList[num + 1];
		visited = new boolean[num + 1];
		for (int i = 1; i <= num; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i <= linkednum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		dfs(1);
		System.out.print(count);
	}

	static void dfs(int v) {
		visited[v] = true;
		for (int temp : graph[v]) {
			if (!visited[temp]) {
				count++;
				dfs(temp);
			}
		}
	}

}
