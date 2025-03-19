package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b18111 {
	public static int[][] maps;
	public static int min, max, n, m, b, mintime, result;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		max = 0;
		min = 256;
		maps = new int[n][m];
		mintime = Integer.MAX_VALUE;
		result = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int point = Integer.parseInt(st.nextToken());
				if (min > point) {
					min = point;
				}
				if (max < point) { // max값에 최대값 저장
					max = point;
				}
				maps[i][j] = point;
			}
		}

		for (int k = min; k <= max; k++) {
			int time = 0;
			int removeblocks = 0; // 제거한 블록 개수
			int addblocks = 0; // 추가한 블록 개수
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int cheight = maps[i][j];

					if (cheight < k) {
						int addheight = k - cheight;
						time += addheight;
						addblocks += addheight;
					} else if (cheight > k) {
						int exitheight = cheight - k;
						time += 2 * exitheight;
						removeblocks += exitheight;
					}
				}
			}
			if (removeblocks + b >= addblocks) {
				if (time < mintime) {
					mintime = time; // 그때의 시간
					result = k; // 그때의 높이
				} else if (time == mintime && k > result) {
					result = k;
				}
			}
		}
		System.out.print(mintime + " " + result);
	}
}
