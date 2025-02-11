package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			String s = br.readLine();
			int check = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(') {
					check++;
				}
				if (s.charAt(j) == ')') {
					check--;
					if (check < 0) { // 닫는 괄호가 여는거보다 먼저나올때
						check = -1;
						break;
					}
				}
			}

			if (check == 0) {
				str[i] = "YES";
			} else {
				str[i] = "NO";
			}
		}

		for (String s : str) {
			System.out.println(s);
		}

	}

}
