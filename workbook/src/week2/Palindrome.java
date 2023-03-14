package week2;

import java.util.Scanner;

public class Palindrome {
	public static int findreverse(int n) {
		int r,rev=0;
		while(n!=0)
		{
			r = n%10;
			rev = rev*10+r;
			n = n/10;
		}
		return rev;
	}
	public static boolean ispalindrome (int n) {
		int rev = findreverse(n);
		if(rev==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void display(int n) {
		for(int i =11;i<=n;i++)
		{
			if(ispalindrome(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
       int n = s.nextInt();
      display(n);
        
       
	}

}
