package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2753 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int checknum = Integer.parseInt(st.nextToken());
		if ((checknum % 4 == 0 && checknum % 100 != 0) || checknum % 400 == 0) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}

}
