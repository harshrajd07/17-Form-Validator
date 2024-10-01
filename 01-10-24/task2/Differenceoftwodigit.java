package com.task8;
public class Differenceoftwodigit {
  public static int getTwodigitdiff(int n){
	  int difference=0;
		  if (n >= 10 && n <= 99) {
	            int tensDigit = n / 10;
	            int onesDigit = n % 10;
	            difference = tensDigit + onesDigit;
	  }
		  return difference;
}
}