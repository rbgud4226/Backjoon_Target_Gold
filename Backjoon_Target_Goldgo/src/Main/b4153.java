package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b4153 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0) {
				break;
			}
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			Arrays.sort(arr);
			if(arr[2] * arr[2] == (arr[1] * arr[1]) + (arr[0] * arr[0])){
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}

}
