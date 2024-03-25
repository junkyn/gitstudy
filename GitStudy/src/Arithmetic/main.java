package Arithmetic;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();

		minus(a, b);
		name();

		name();
		sc.close();
	}

	static int multiply(int a, int b) {
		return a * b;
	}


	static int add(int a, int b) {
		return a + b;

	}

	static int minus(int a, int b) {
		return a - b;
	}

	static void name() {
		System.out.println("지수tv");
		System.out.println("준규tv");
	}
}
