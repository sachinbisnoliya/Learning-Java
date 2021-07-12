package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");

	//int num1=1;
	//int num2=2;
	//int num3=3;
    //int sum=num1+num2+num3;
	//System.out.println(sum);

		float subject1=80;
		float subject2=90;
		float subject3=20;
		float cgpa= (subject1+subject2+subject3)/30;

		System.out.println(cgpa);
    }
}

	//** the snippet returns the minimum between two numbers */

	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}


	//Prog
public class ExampleMinNumber {

	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
	}

	/** returns the minimum of two numbers */
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
}