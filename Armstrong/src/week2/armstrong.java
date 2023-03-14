package week2;
import java.lang.Math;
import java.util.Scanner;

public class armstrong {
	public static boolean Armstrong(int n)
	{
	   int n1=n,n2 =n,sum =0,c=0,rem;
	   while(n1>0)
	   {		  
		   c++;
		   n1=n1/10;
	   }
	   while(n2>0)
	   {
		   rem = n2%10;
		   sum = (int)(sum+Math.pow(rem,c));
		   n2 = n2/10;
	   }
	   if(sum==n) {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
	}
	public static void display(int n) {
		for(int i=0;i<=n;i++) {
			if(Armstrong(i)==true)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
          display(m);
       

	}

}
