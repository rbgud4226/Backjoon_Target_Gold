package classAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			list.add(new int[] { weight, height });
		}

		int[] ranks = new int[num];

		for (int i = 0; i < num; i++) {
			int rank = 1;
			for (int j = 0; j < num; j++) {
				if (i != j) {
					if (list.get(i)[0] < list.get(j)[0] && list.get(i)[1] < list.get(j)[1]) {
						rank++;
					}
				}
			}
			ranks[i] = rank++;
		}
		for(int r : ranks) {
			System.out.print(r + " ");
		}
	}

}
