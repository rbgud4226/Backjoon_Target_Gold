package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str.equals(".")) {
				break;
			}
			Stack<Character> stk = new Stack<>();
			Boolean check = true;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') {
					stk.push(str.charAt(i));
				} else if (str.charAt(i) == ')') {
					if (stk.isEmpty() || stk.pop() != '(') {
						check = false;
						break;
					}
				} else if (str.charAt(i) == ']') {
					if (stk.isEmpty() || stk.pop() != '[') {
						check = false;
						break;
					}
				}
			}
			if (!stk.isEmpty()) {
				check = false;
			}

			System.out.println(check ? "yes" : "no");
		}
	}
}
