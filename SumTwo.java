package March;

import java.util.Scanner;

public class SumTwo {
	
	public static void main(String args[]){
		
		Sum();
		
	}
	
	public static void Sum(){
		System.out.println("Please enter first number");
		Scanner scan = new Scanner(System.in);
		int firstnum = scan.nextInt();
		System.out.println("Please enter second number");
		int secondnum = scan.nextInt();
		int sumNum = firstnum + secondnum;
		System.out.println("The sum of two numbers entered by you is " +sumNum);
		
	}

}
