package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<>();
		String strs = "";
		int countnum = 0;
		while(countnum < 10) {
			strs = br.readLine();
			int num = Integer.parseInt(strs);
			int resultnum = num % 42; //나눈 결과값 
			hs.add(resultnum);
			countnum++;
		}
		System.out.print(hs.size());
	}

}
