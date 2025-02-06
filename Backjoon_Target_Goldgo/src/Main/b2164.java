package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> ll = new LinkedList<>();
		for(int i=1; i<=num; i++) {
			ll.offer(i); //큐에 카드 넣음
		}
		while(ll.size() > 1) {
			ll.poll(); //첫 카드 제거
			ll.offer(ll.poll()); //그다음 카드를 맨 마지막에 넣는다
		}
		
		System.out.print(ll.poll());
		
	}
}
