package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<num; i++) {
			int sum = 0;
			int check = i;
			while(check != 0) {
				sum += check % 10;
				check = check / 10; //자리 수 옮김
			}
			if(sum + i == num) {
				result = i;
				break;
			}
		}
		System.out.print(result);
	}

}
