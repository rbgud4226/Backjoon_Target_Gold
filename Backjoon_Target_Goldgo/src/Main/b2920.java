package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		if(text.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("ascending");
		}else if(text.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
	}

}
