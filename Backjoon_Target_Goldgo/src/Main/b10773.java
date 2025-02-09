package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();
		
		for(int i=0; i<num; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0 && !stk.isEmpty()) {
				stk.pop();
			}
			if( n != 0) {
				stk.push(n);
			}
		}
		
		int sum = 0;
		for(int s : stk) {
			sum += s;
		}
		System.out.print(sum);
	}
}
