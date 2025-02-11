package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int check = 0;
		int count = 0;
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<num; i++) {
			check = 0;
			for(int j=1; j<=arr[i]; j++) {
				if(arr[i] % j == 0) {
					check++;
				}
			}
			if(check == 2) {
				count++;
			}
		}
		System.out.print(count);
	}
}
