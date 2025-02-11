package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<words.length(); i++) {
			if(i==count-1) {
				System.out.print(words.charAt(i));
			}
		}
	}

}
