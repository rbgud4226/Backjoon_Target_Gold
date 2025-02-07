package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1436 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int target = 666;
		int count = 1;
		while(count != num) {
			target++;
			if(String.valueOf(target).contains("666")) {
				count++;
			}
		}
		
		System.out.print(target);
	}

}
