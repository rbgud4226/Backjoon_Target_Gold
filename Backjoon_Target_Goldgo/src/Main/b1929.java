package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[n + 1];
		check[0] = true;
		check[1] = true;
		for(int i=2; i*i<=n; i++) { // i는 2부터 i제곱까지 볌위설정
			if(!check[i]) {
				for(int j=i*i; j<=n; j+=i) { //i가 소수이면 i의 배수들은 true로 설정해서 제거
					check[j] = true;
				}
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}

}
