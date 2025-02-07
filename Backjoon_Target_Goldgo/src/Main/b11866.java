package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> qu = new LinkedList<>();
		for(int i=1; i<=num; i++) {
			qu.add(i);
		}
		
		while(qu.size() > 1) {
			for(int j=0; j<index -1; j++) {
				qu.offer(qu.poll());   //인덱스까지 뽑은 큐를 계속 추가하면 결국 맨앞에는 인덱스번째의 큐만 나온다 그때의 값을 sb에 저장
			}
			sb.append(qu.poll()).append(", ");
			
		}
		sb.append(qu.poll());
		System.out.print("<" + sb + ">");
	}

}
