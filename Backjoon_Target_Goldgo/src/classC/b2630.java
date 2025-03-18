package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2630 {
	public static int[][] arr;
	public static int white = 0;
	public static int blue = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dividesize(0,0,num);
		System.out.println(white);
		System.out.println(blue);
		
	}

	public static boolean colorcheck(int row, int col, int leng) {
		int color = arr[row][col];
		for (int i = row; i < row + leng; i++) {
			for (int j = col; j < col + leng; j++) {
				if (arr[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void dividesize(int row, int col, int size) {
		if(colorcheck(row, col, size)) {
			if(arr[row][col] == 0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
		int divsize = size / 2;
		dividesize(row, col, divsize);
		dividesize(row, col + divsize, divsize);
		dividesize(row + divsize, col, divsize);
		dividesize(row + divsize, col + divsize, divsize);
		
	}

}
