package assignment1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int result=0;
		// TODO Auto-generated method stub
		Scanner mul=new Scanner(System.in);
		System.out.print("Input a number:");
		int n=mul.nextInt();
		for(int i=1;i<=10;i++)
		{
			result=n*i;
			System.out.println(n+ " x " +i+ " = " +result);
	}
		

}}
