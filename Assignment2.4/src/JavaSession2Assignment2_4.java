
//Problem Statement - Write a program to find the highest among the given 3 numbers.

import java.util.Scanner;

public class JavaSession2Assignment2_4 {

	public static void main(String[] args) {

		System.out.println("Enter three integers number");
		highestNumber N = new highestNumber();
		N.print();

	}

}

class highestNumber {

	int a, b, c;
	Scanner inputValue;

	highestNumber() {

		inputValue = new Scanner(System.in);

	}

	void print() {
		
		a = inputValue.nextInt();
		b = inputValue.nextInt();
		c = inputValue.nextInt();

		if (a > b && a > c) {
			System.out.println("First number is largest");
		} 
		else if (b > a && b > c) {
			System.out.println("Second number is largest");
		} 
		else if (c > a && c > b) {
			System.out.println("Thrid number is largest");
		}

		else {
			System.out.println("All are equal or any two values are equal");
		}

	}

}
