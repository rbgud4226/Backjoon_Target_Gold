package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int count = 0;
		int[] arr = new int[9];
		for(int i=1; i<arr.length+1; i++) {
			int a = Integer.parseInt(br.readLine());
			if(max < a) {
				max = a;
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
