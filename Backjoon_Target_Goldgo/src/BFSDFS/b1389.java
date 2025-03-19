package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1389 {
	public static ArrayList<Integer>[] lista;
	public static int answer;
	public static int n, m;
	public static boolean[] check;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		lista = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			lista[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) { // 서로 연결된 간선일 경우 true
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			lista[a].add(b);
			lista[b].add(a);
		}

		int[] result = new int[n + 1]; // 결과 담을 배열
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				answer = Integer.MAX_VALUE;
				if (i != j) {
					check = new boolean[n + 1];
					dfs(i, j, 0);
					result[i] += answer;
				}
			}
		}
		int minidx = 1;
		int min = result[1];
		for (int i = 2; i <= n; i++) {
			if (result[i] < min) {
				min = result[i];
				minidx = i;
			}
		}
		System.out.println(minidx);

	}

	public static void dfs(int start, int end, int count) {
		if (start == end) {
			answer = Math.min(answer, count);
			return;
		}
		check[start] = true; 
		for (int s : lista[start]) { 
			if (!check[s]) {
				dfs(s, end, count + 1);
			}
		}

	}

}
