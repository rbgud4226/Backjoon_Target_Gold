package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.contains("-")) {
			String[] arr = str.split("-");
			int result = 0;
			if (arr[0].contains("-")) {
			
				String[]  sa = arr[0].split("-");
				for(String z : sa) {
					result += Integer.parseInt(z);
				}
			}
			else if(arr[0].contains("+")) {
			
				String[]  sa = arr[0].split("\\+");
				for(String k : sa) {
					result += Integer.parseInt(k);
				}
			}
			else {
				result = Integer.parseInt(arr[0]);
			}
			for (int i = 1; i < arr.length; i++) {
				int val = 0;
				if (arr[i].contains("+")) {
					String[] arr2 = arr[i].split("\\+");
					for (String a2 : arr2) {
						val += Integer.parseInt(a2);
					}
				} else {
					val = Integer.parseInt(arr[i]);
				}
				result -= val;
			}
			System.out.print(result);
		}

		else { 
			String[] arrp = str.split("\\+");
			int result = 0;
			for (String ap : arrp) {
				result += Integer.parseInt(ap);
			}
			System.out.print(result);
		}

	}

}
