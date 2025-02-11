package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder[] sb = new StringBuilder[201];
		
		for (int i = 0; i < 201; i++) {  //기본적으로 null 상태이므로 초기화가 필요함!!
			sb[i] = new StringBuilder();
		}
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
				sb[age].append(age + " " + name + "\n");
		}
 
		for (int j = 0; j < 201; j++) {
			if (sb.length > 0) {
				System.out.print(sb[j]);
			}
		}

	}

}
