package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String result = String.valueOf((a * b) * c);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<result.length(); j++) {
				char d = result.charAt(j);
				if(i == (d - '0')) {
					arr[i] += 1;
				}
			}
		}
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
