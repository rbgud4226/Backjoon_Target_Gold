package classAB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2884 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hours = Integer.parseInt(st.nextToken());
		int mins = Integer.parseInt(st.nextToken());
	
		int beforetime = (hours * 60) + mins;
		//전체 시간에서 45분을 빼고 시, 분으로 분리
		int aftertime = beforetime - 45;
		if(aftertime < 0) {
			aftertime += 24 * 60;
		}
		int afterhours = aftertime / 60;
		int aftermins = aftertime - (afterhours * 60);
		System.out.print(afterhours + " " + aftermins);
	}

}
