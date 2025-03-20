package classC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5525 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int onum = Integer.parseInt(br.readLine());
		int totalLength = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int i = 1;
		int ioicount = 0;
		int ioimaxcount = 0;

		while (i < totalLength - 1) {
			// 1부터 11까지
			if (str.charAt(i - 1) == 'I' && str.charAt(i) == 'O' && str.charAt(i + 1) == 'I') {
				ioicount++;
				if(ioicount >= onum) {
					ioimaxcount++;
				}
				i += 2; //다음 ioi 확인
			}
			else {
				ioicount =0;
				i++; // 한칸 띄우고
			}
		}
		
		System.out.println(ioimaxcount);
	}

}
