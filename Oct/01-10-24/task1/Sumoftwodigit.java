package com.task7;

public class Sumoftwodigit {
	public static int getTwodigitSum(int n) 
	{
		int sum=0;
		if (n >= 10 && n <= 99) {
            int tensDigit = n / 10;
            int onesDigit = n % 10;
             sum = tensDigit + onesDigit;
          
        } 
		
		  return sum;

      }
}
