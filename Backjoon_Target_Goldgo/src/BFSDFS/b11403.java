package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11403 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[N + 1][N + 1];
        

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 플로이드 워셜 알고리즘
        for (int k = 1; k <= N; k++) {  //중간
            for (int i = 1; i <= N; i++) {  //시작
                for (int j = 1; j <= N; j++) {  //끝
                    if (graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1;  // i에서 j로 갈 수 있는 경로가 있다면 1로 설정
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
//	static int[][] maps;
//	static List<Integer>[] graph;
//	static int num;
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		num = Integer.parseInt(br.readLine());
//		maps = new int[num + 1][num + 1];
//		graph = new ArrayList[num + 1];
//		
//		for(int i=1; i<=num; i++) {
//			graph[i] = new ArrayList<>();
//		}
//		
//		for (int i = 1; i <= num; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for (int j = 1; j <= num; j++) {
//				maps[i][j] = Integer.parseInt(st.nextToken());
//				if (maps[i][j] == 1) {
//					graph[i].add(j);
//				}
//			}
//		}
//
//		for (int i = 1; i <= num; i++) {
//			boolean[] visited = new boolean[num + 1];
//			dfs(i, visited);
//
//			for (int j = 1; j <= num; j++) {
//				
//				System.out.print(visited[j] ? 1 : 0);
//				if (j != num) {
//                    System.out.print(" ");
//                }
//			}
//			System.out.println();
//		}
//
//	}
//
//	static void dfs(int x, boolean[] visited) {
//		visited[x] = true;
//		for (int next : graph[x]) {
//			if (!visited[next]) {
//				dfs(next, visited);
//			}
//		}
//	}

}
