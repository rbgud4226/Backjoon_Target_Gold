package classC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class b11279 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < num; i++) {
			int val = Integer.parseInt(br.readLine());
			if (val == 0) {
				if (pq.size() == 0) {
					bw.write("0\n");
				} else {
					bw.write(pq.poll() + "\n");
				}
			}
			else {
				pq.add(val);
			}
		}
		bw.flush();
		bw.close();
	}

}
