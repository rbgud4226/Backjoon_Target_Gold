package classD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1629 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println(check(a, b, c));
	}

	public static long check(long a, long b, long c) {
		if (b == 1) {
			return a % c;
		} else {
			long devidecheck = check(a, b / 2, c);
			if (b % 2 == 1) {
				return (devidecheck * devidecheck % c) * a % c;
			}
			return devidecheck * devidecheck % c;
		}
	}

}
