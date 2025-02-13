package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1012 {
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	static HashMap<Integer, Integer> hm;
	static int[][] move = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcase; i++) {
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			int cabbage = Integer.parseInt(st.nextToken());

			graph = new ArrayList<>();
			visited = new boolean[cabbage];
			hm = new HashMap<>();
			int node = 0;

			for (int j = 0; j < cabbage; j++) { // 그래프 초기화
				graph.add(new ArrayList<>());
			}

			for (int k = 0; k < cabbage; k++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				hm.put(x * height + y, node++);
			}

			for (int key : hm.keySet()) {
				int a = key / height;
				int b = key % height;
				int index = hm.get(key); // 연결되어있을때 고유인덱스

				for (int[] mv : move) { // 좌표
					int ma = a + mv[0];
					int mb = b + mv[1];
				
					
					if (ma >= 0 && ma < width && mb >= 0 && mb < height) {  //좌표 0,0 이상일때만 
						int linkkey = ma * height + mb;
						if (hm.containsKey(linkkey)) { // 이동했을때 연결되어있으면
							int linkindex = hm.get(linkkey); // 연결되어있는 좌표의 고유인덱스
							graph.get(index).add(linkindex); // 둘은 연결되어있으니 그래프에 넣는다
							graph.get(linkindex).add(index);
						}
					}
				}
			}

			for (int p = 0; p < cabbage; p++) {
				if (!visited[p]) {
					bfs(p);
					count++;
				}
			}

			System.out.println(count);
		}

	}

	static void bfs(int start) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(start);
		visited[start] = true;

		while (!qu.isEmpty()) {
			int q = qu.poll();
			for (int gr : graph.get(q)) { // 해당번호에 연결되어있는 노드들 탐색
				if (!visited[gr]) {
					qu.add(gr);
					visited[gr] = true;
				}
			}
		}
	}

}
