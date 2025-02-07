package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b30802 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int j=0; j<6; j++) {
			int values = arr[j] / t;  
			if(arr[j] % t !=0) {
				values++;
			}
			sum += values;
		}
		
		int penvalue = num / p;
		int penvalue2 = num % p;
		
		System.out.println(sum); // 티셔츠 최소묶음
		System.out.print(penvalue + " " + penvalue2);
		
	}

}
