package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1074 {
	static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int size = (int) Math.pow(2, n);
		find(size, r, c);
		System.out.print(count);
	}

	public static void find(int size, int r, int c) {

		if (size == 1) {
			return;
		}

		int mid = size / 2;
		int mapsize = mid * mid;

		if (r < mid && c < mid) {
			find(mid, r, c);
		} else if (r < mid && c >= mid) {
			count += mapsize;
			find(mid, r, c - mid);
		} else if (r >= mid && c < mid) {
			count += 2 * mapsize;
			find(mid, r - mid, c);
		} else {
			count += 3 * mapsize;
			find(mid, r - mid, c - mid);
		}
	}

}
