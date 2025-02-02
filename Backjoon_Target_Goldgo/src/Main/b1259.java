package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1259 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String questions = "";
		while((questions = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			for(int i=questions.length()-1 ; i>=0; i--) {
				if(String.valueOf(questions.charAt(0)).equals("0")){
					return;
				}
				sb.append(questions.charAt(i));
			}
			if(questions.equals(sb.toString())) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
