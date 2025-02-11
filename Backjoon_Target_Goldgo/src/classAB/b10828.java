package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			switch (order) {
			case "push":
				int value = Integer.parseInt(st.nextToken());
				stk.push(value);
				break;

			case "top":
				if (stk.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stk.peek());

				}
				break;

			case "size":
				System.out.println(stk.size());
				break;

			case "empty":
				if (stk.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;

			case "pop":
				if (stk.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stk.pop());
				}
				break;
			}
		}
	}

}
