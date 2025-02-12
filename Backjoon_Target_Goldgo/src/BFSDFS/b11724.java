package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class b11724 {

	static List<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int linenum = Integer.parseInt(st.nextToken());
		int count = 0;

		graph = new ArrayList[num + 1];
		visited = new boolean[num + 1];
		for(int i=1; i<=num; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 1; i <= linenum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}

		for (int i = 1; i <= num; i++) {
			if (!visited[i]) {
				bfs(i);
				count++;
			}
		}
		System.out.print(count);
	}

	static void bfs(int start) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(start);
		visited[start] = true;

		while (!qu.isEmpty()) {
			int v = qu.poll();
			for (int temp : graph[v]) {
				if (!visited[temp]) {
					visited[temp] = true;
					qu.add(temp);
				}
			}
		}
	}

}
