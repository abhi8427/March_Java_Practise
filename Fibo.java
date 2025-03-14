package March;

import java.util.Scanner;

public class Fibo {
	
	public static void main(String ab[]){
		
		fiboSeries();
		
	}
	
	
	public static void fiboSeries(){
		System.out.println("Please enter the terms");
		Scanner scan = new Scanner(System.in);
		int term = scan.nextInt();
		System.out.println("You actually want to generate Fibonici Series upto "+ term + "th term");
		System.out.println("Below is the generated fibonici series");
		
		int n1 = 0; int n2 = 1; int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 1;i<=term-2;i++){
			n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
