package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String beforenum = br.readLine();
		int sum = 0;
		for(int i=0; i<num; i++){
			  sum += beforenum.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
