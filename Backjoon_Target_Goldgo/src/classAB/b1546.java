package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] scores = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		double max = 0;
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < num; i++) {
			int score = Integer.parseInt(st.nextToken());
			scores[i] = score;
			if (score > max) {
				max = score;
			}
		}
		for (int j = 0; j < scores.length; j++) {
			sum += (scores[j] / max) * 100;
		}
		avg = sum / num;
		System.out.print(avg);
	}
}
