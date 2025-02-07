package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> qu = new LinkedList<>();
		int endvalue = 0;
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.equals("push")) {
				int ordervalue = Integer.parseInt(st.nextToken());
				qu.add(ordervalue);
				endvalue = ordervalue;
			}

			if (order.equals("front")) {
				if (qu.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(qu.peek());
				}
			}

			if (order.equals("back")) {
				if (qu.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(endvalue);
				}
			}

			if (order.equals("size")) {
				System.out.println(qu.size());
			}

			if (order.equals("empty")) {
				if (qu.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}

			}

			if (order.equals("pop")) {
				if (qu.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(qu.poll());
				}
			}

		}

	}

}
