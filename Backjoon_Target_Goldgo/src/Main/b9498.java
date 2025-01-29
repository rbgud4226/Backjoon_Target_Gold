package Main;

import java.util.Scanner;

public class b9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 89) {
			System.out.print("A");
		}else if(a > 79) {
			System.out.print("B");
		}else if(a > 69) {
			System.out.print("C");
		}else if(a > 59){
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
		// TODO Auto-generated method stub

	}

}
