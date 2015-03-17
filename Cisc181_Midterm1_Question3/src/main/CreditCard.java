package main;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your credit card number:" );
		long cc = input.nextLong();
		int count = 0;
		long array[] = new long [16];
		}
public static long length(long a){
	int digit = 0;
	String stringSize = Long.toString(a);
	digit = stringSize.length();
	return digit;	
}
public static long getNumber(long cc, int i){
			long numberResult = cc;
			for(int c = 0; c<length(cc) - i; c++)
				numberResult /= 10;
			return numberResult;
}
public static long sumOfOdd(long cc){
	long numberResult = 0;
	if (cc != 0){
		numberResult = (numberResult + (cc % 10));
	}
	return numberResult;
}
//Cannot figure out error below when trying to figure out double.
public static long sumOfDoubleEven(long cc){
	long numberResult = 0;
	String stringSize = Long.toString(cc);
	for(long a = numberResult.length() - 2; a > -1; a -=2){
		numberResult += Long.parseLong("" + stringSize.charAt(a));
	}
}

public static boolean isValid(long cc){
	long total = sumOfDoubleEven(cc) + sumOfOdd(cc);
	if(total % 10 == 0){
		System.out.println("Your card is valid");
		return true;
	}else{
		System.out.println("You card is invalid");
		return false;
		
	}
}
}
