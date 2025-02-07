package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1966 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int textnum = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			int count = 0;
			st = new StringTokenizer(br.readLine());
			Queue<int[]> qu = new LinkedList<>();
			for (int j = 0; j < textnum; j++) {
				int importantindex = Integer.parseInt(st.nextToken());
				qu.offer(new int[] { importantindex, j });
			}
 
			while (!qu.isEmpty()) {
				int[] first = qu.peek();
				Boolean checkfirst = true;

				for (int[] a : qu) {
					if (a[0] > first[0]) { // 중요도 비교해서 뒤에가 높으면
						checkfirst = false;
						break;
					}
				}

				if (checkfirst) {
					qu.poll();
					count++;
					if (first[1] == target) {
						bw.write(count + "\n");
						break;
					}
				} else {
					qu.offer(qu.poll());
				}
			}
		}
		bw.close();
	}
}
