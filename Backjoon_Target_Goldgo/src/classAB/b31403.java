package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b31403 {
	public int intplus(String a, String b, String c) {
		return Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);	
	}
	
	public String stringplus(String a, String b , String c) {
		String onestep = a+b;
		int twostep = Integer.parseInt(onestep) - Integer.parseInt(c);
		String result = String.valueOf(twostep);
		return result;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		b31403 firstmethod = new b31403();
		b31403 secondmethod = new b31403();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		System.out.println(firstmethod.intplus(a,b,c));
		System.out.println(secondmethod.stringplus(a, b, c));
	}

}
