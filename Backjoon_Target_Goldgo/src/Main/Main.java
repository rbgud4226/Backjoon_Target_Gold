package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			String word = st.nextToken();
			int arr[] = new int[26];
			for(int i=0; i<arr.length; i++) {
				arr[i] = -1;
			}
			
			for(int i=0; i<word.length(); i++) {
				char w = word.charAt(i); // w는 해당하는 알파벳을 의미
				if(arr[w-97] == -1) { //아스키코드값으로 해당위치의 문자가 언제나오는지 기록하기 위해 사용 a가 97임으로 a가 나온다면 arr[0] = 0 이된다.
					arr[w-97] = i;
				}
			}
			
			for(int answer : arr) {
				System.out.print(answer + " ");
			}
	}

}
