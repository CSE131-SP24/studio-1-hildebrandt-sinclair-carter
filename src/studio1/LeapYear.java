package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		double year = in.nextDouble();
		boolean leapyear = false;
		
		if ((year%4==0 && year%100!=0)|| year%400==0) {
			leapyear = true;
		}
		System.out.println((int)year + " is a leap year: " + leapyear);
	}

}
