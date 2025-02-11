package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2609 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int smin = 0;
		int smax = 0;
		int check = 1;
		int small = Math.min(a, b);
		for(int i=1; i<=small; i++) {
			if(a % i == 0 && b % i == 0) {
				smin = i;
			}
		}
		
		for(int j=1; j<=small; j++) {
			if(a % j == 0 && b % j == 0) {
				check = j;
			}
		}
		int p = a / check;
		int q = b / check;
		smax = check * p * q;
		System.out.println(smin);
		System.out.println(smax);
	}
}
