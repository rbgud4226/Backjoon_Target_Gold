package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b30804 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] count = new int[10];
		int start = 0;
		int end = 0;
		int maxLength = 0;
		int nowcount = 0;

		while (end < num) {
			if (count[arr[end]] == 0) {
				nowcount++;
			}
			count[arr[end]]++;
			end++;
			
			while(nowcount > 2) {
				count[arr[start]]--;
				if(count[arr[start]]==0) {
					nowcount--;
				}
				start++;
			}
			
			maxLength = Math.max(maxLength, end - start);
		}
		
		System.out.print(maxLength);
	}
}
