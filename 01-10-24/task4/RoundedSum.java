package com.task10;

public class RoundedSum{
public static int sumOfRoundedValues(int a, int b, int c){
	a=((a/10)+((a%10)/5))*10;//20
	b=((b/10)+((b%10)/5))*10;//30
	c=((c/10)+((c%10)/5))*10;//70
    return a+b+c;
}
}
