package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b6064 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int m = 0;
		int n = 0;
		int mx = 0;
		int nx = 0;
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			mx = Integer.parseInt(st.nextToken()) - 1;
			nx = Integer.parseInt(st.nextToken()) - 1;
			boolean check = false;

			for(int j=mx; j<= m * n; j+=m) {
				if(j % n == nx) {
					sb.append(j + 1).append("\n");
					check = true;
					break;
				}
			}
			if(!check) {
				sb.append("-1").append("\n");
			}
		}
		System.out.print(sb);
	}

}
