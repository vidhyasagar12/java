package p1;

public class c1 {
	protected int a=10;//default instance variables
	 int b = 20;
	 protected void display()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		c1 c =new c1();
		c.display();//default,private,public,protected variables inside the class
		
	}

}
