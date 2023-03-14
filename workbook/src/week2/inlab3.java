package week2;

import java.util.Scanner;

public class inlab3 {
	public static int climbstairs(int n) {
		return helper(0,1,n);
	}
	public static int helper(int x,int y, int n) {
		return (n==0?x+n:helper(y,x+y,n));
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int ans = climbstairs(n);
	System.out.println("you can climb in"+ans+"ways");

	}

}
