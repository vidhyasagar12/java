package demo;

public class Testcls implements Pi1,Pi2 {
   public void show()
   {
	   Pi1.super.show();
	   Pi2.super.show();
   }
  public void showofPi1()
  {
	  Pi1.super.show();
  }
  public void showofPi2()
  {
	  Pi2.super.show();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Testcls d = new Testcls();
        d.show();
        System.out.println("now excuting showpi1(),showofpi2()");
        d.showofPi1();
        d.showofPi2();
        
	}

}
