package assignment1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner op=new Scanner(System.in);
    System.out.print("Input first number:");
    int n1=op.nextInt();
    System.out.print("Input second number:");
    int n2=op.nextInt();
    System.out.println();
    System.out.println(n1+ " + " +n2+ " = " +(n1+n2));
    System.out.println(n1+ " - " +n2+ " = " +(n1-n2));
    System.out.println(n1+ " * " +n2+ " = " +(n1*n2));
    System.out.println(n1+ " / " +n2+ " = " +(n1/n2));
    System.out.println(n1+ " mod " +n2+ " = " +(n1%n2));
    
         
	}

}
