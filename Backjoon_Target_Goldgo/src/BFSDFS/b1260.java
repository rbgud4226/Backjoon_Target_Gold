package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1260 {
	static ArrayList<Integer>[] graph;
	static boolean[] dfsvisited;
	static boolean[] bfsvisited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정점의 개수
		int m = Integer.parseInt(st.nextToken()); // 간선의 개수
		int start = Integer.parseInt(st.nextToken()); // 시작노드 번호

		graph = new ArrayList[n + 1]; // 그래프
		dfsvisited = new boolean[n + 1]; // 방문 여부 확인
		bfsvisited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			bfsvisited[i] = false;
		}
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		for (int i = 1; i <= n; i++) {
		    Collections.sort(graph[i]);  //정점 번호가 작은 것 조건이 있어서 정렬
		}

		dfs(start);
		System.out.println();
		bfs(start);
	}

	public static void dfs(int v) {
		dfsvisited[v] = true;
		System.out.print(v + " "); // 방문 노드 출력

		for (int temp : graph[v]) { // 해당하는 그래프의 요소 탐색
			if (!dfsvisited[temp]) {
				dfs(temp);
			}
		}
	}

	public static void bfs(int w) {
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(w);
		bfsvisited[w] = true;

		while (!qu.isEmpty()) {
			int v = qu.poll();
			System.out.print(v + " "); // 방문 노드 출력
			for (int temp : graph[v]) {
				if (!bfsvisited[temp]) {
					bfsvisited[temp] = true;
					qu.offer(temp);
				}
			}
		}
	}

}
