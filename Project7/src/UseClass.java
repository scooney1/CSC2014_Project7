/**
 * Author:	Sam Cooney
 * Project:	Project7
 * Date:	Sep 27, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Master class for Project 7.
 */

import java.util.Scanner;		// Allows use of Scanner.
import java.text.DecimalFormat;	// Allows use of Decimal Format.

public class UseClass {

	public static void main(String[] args) {
		Box myBox = new Box(7);								// Instantiate object of class Box.
		Scanner scan = new Scanner(System.in);				// Instantiate object of class Scanner.
		DecimalFormat fmt = new DecimalFormat("0.0000");	// Instantiate object of class DecimalFormat.
		
		//-----------------------------------Part B------------------------------------
		
		System.out.println("Enter a line of text at least 10 characters long: ");
		String sfirst = scan.nextLine();			// Read in first string.
		String ssecond = sfirst.toUpperCase();		// Define second string.
		String sthird = sfirst.toLowerCase();		// Define third string.
		String sfourth = sfirst.replace('e', 'f');	// First change for fourth string.
		sfourth = sfourth.replace('E', 'F');		// Final change for fourth string.
		System.out.println("This is your string:\n" + sfirst);
		System.out.println("This is your string as uppercase letters:\n" + ssecond);
		System.out.println("This is your string as lowercase letters:\n" + sthird);
		System.out.println("This is your string with the letter e replaced with f:\n" + sfourth);
		System.out.println("The length of your string is: " + sfirst.length());
		// Prints out string length.
		System.out.println("The fifth character in your string is: " + sfirst.substring(4, 5));
		// Prints out the fifth character.
		System.out.println("The substring of your string after the fifth letter is:\n" + sfirst.substring(5));
		// Prints out the substring following character 5.
		
		//-----------------------------------Part C------------------------------------

		System.out.println("Enter a number between 1.000 and 9.999:");
		double radius = scan.nextDouble();			// Read in radius value.
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3.0);
		System.out.println("Your radius it: " + radius);
		System.out.println("The volume of your sphere is: " + fmt.format(volume));
		
		//-----------------------------------Part D------------------------------------

		System.out.println(myBox);
		scan.close();
	}
}
