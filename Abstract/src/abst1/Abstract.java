package abst1;
abstract class A
{
	int a=6;
	abstract void display();
	void show()
	{
		System.out.println(a);
	}
}
 class b extends A
{
	int b=  10;
	 void display()
	{
		System.out.println("class a abstract");
	}
	 void show1()
	 {
		 System.out.println(b);
	 }
	
	
}
class c extends b
{
	int c = 3;
	void show2()
	{
		System.out.println(c);
	}
}
public class Abstract {

	public static void main(String[] args) {
   b obj = new b();
   obj.show1();
   obj.show();
   obj.display();
  // obj.show2();
	}

}
