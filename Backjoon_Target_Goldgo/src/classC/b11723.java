package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int s = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (!order.equals("all") && !order.equals("empty")) {
				int value = Integer.parseInt(st.nextToken());

				switch (order) {
				case "add":
					s = s | (1 << (value - 1));
					break;

				case "remove":
					s = s & ~(1 << (value - 1));
					break;

				case "check":
					sb.append((s & (1 << (value - 1))) != 0 ? "1\n" : "0\n");
					break;

				case "toggle":
					s = s ^ (1 << (value - 1));
					break;

				}
			} else {
				switch (order) {
				case "all":
					s = (1 << 20) - 1;
					break;

				case "empty":
					s = 0;
					break;
				}
			}
		}
		System.out.print(sb);
	}

}
