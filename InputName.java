package March;

import java.util.Scanner;

public class InputName {
	
	public static void main (String ab[]){
		
		name();
		
	}

	public static void name(){
		System.out.println("Enter your Name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Your Name is " + name);
	}
}
