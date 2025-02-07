package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b10816 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> cardm = new HashMap<>();
		for(int i=0; i<num; i++) {
			int cardnum = Integer.parseInt(st.nextToken());
			cardm.put(cardnum, cardm.getOrDefault(cardnum, 0) + 1);
		}
		
		int num2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int j=0; j<num2; j++) {
			 int listnum = Integer.parseInt(st.nextToken());
			 bw.write(cardm.getOrDefault(listnum, 0) + " ");
		}
		bw.close();

	}
}
