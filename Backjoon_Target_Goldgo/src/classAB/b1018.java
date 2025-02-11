package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1018 {
	static String[] chessarr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 체스판의 행 크기
		int m = Integer.parseInt(st.nextToken()); // 체스판의 열 크기
		chessarr = new String[n];
		int k = 0;
		int[] result = new int[(n - 7) * (m - 7)];
		// 체스판 입력받기
		for (int i = 0; i < n; i++) {
			chessarr[i] = br.readLine();
		}

		for (int i = 0; i <= n - 8; i++) { // 체스판 자르기
			for (int j = 0; j <= m - 8; j++) {
				result[k++] = checkchess(i, j);
			}
		}
		Arrays.sort(result);
		// 결과 출력
		System.out.println(result[0]);
	}

	public static int checkchess(int a, int b) {
		int maxstartW = 0;
		int maxstartB = 0;
		char checkW;
		char checkB;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					checkW = 'W';
					checkB = 'B';
				} else {
					checkW = 'B';
					checkB = 'W';
				}
				if (chessarr[a + i].charAt(b + j) != checkW) {
					maxstartW++;
				}
				if (chessarr[a + i].charAt(b + j) != checkB) {
					maxstartB++;
				}
			}
		}
		return Math.min(maxstartB, maxstartW);
	}
}
