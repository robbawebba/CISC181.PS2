package mainPackage;

import java.lang.Integer;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else
			return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int a) {
		if (a % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger n) {
		if (n.getValue() % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(MyInteger n) {
		if (n.getValue() % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(MyInteger n) {
		for (int i = 2; i < n.getValue(); i++) {
			if (n.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int n) {
		if (value == n) {
			return true;
		} else
			return false;
	}

	public boolean equals(MyInteger n) {
		if (value == n.getValue()) {
			return true;
		} else
			return false;
	}

	char f = '2';

	public static int parseInt(char[] n) {
		int a = 0;
		int inc = n.length - 1;

		for (int i = 0; i < n.length; i++) {

			int number = n[i] - 48; // subtract 48 to convert from Unicode
			a = (int) (a + (number * (Math.pow(10, inc--))));
		}
		return a;
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}

	// public static void main (String[] args) {
	//
	// MyInteger integer20 = new MyInteger(20);
	// MyInteger integer5 = new MyInteger(5);
	// int compareTo = 5;
	// char[] myArray = {'5', '2', '3', '6'};
	// String myString = "5236";
	//
	// System.out.println(integer20.isEven());
	// System.out.println(integer5.isEven());
	//
	// System.out.println(integer20.isOdd());
	// System.out.println(integer5.isOdd());
	//
	// System.out.println(integer20.isPrime());
	// System.out.println(integer5.isPrime());
	//
	// System.out.println(isEven(integer20.getValue()));
	// System.out.println(isEven(integer5.getValue()));
	//
	// System.out.println(isOdd(integer20.getValue()));
	// System.out.println(isOdd(integer5.getValue()));
	//
	// System.out.println(isPrime(integer20.getValue()));
	// System.out.println(isPrime(integer5.getValue()));
	//
	// System.out.println(isEven(integer20));
	// System.out.println(isEven(integer5));
	//
	// System.out.println(isOdd(integer20));
	// System.out.println(isOdd(integer5));
	//
	// System.out.println(isPrime(integer20));
	// System.out.println(isPrime(integer5));
	//
	//
	// System.out.println(integer20.equals(compareTo));
	// System.out.println(integer5.equals(compareTo));
	//
	// System.out.println(integer20.equals(integer20));
	// System.out.println(integer5.equals(integer20));
	//
	// System.out.println(parseInt(myArray));
	// System.out.println(parseInt(myString));
	//
	//
	// }

}
