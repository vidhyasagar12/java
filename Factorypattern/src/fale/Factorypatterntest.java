package fale;
class circle implements shape{
	public void drawshape()
	{
		System.out.println("shape circle");
	}
}
class rectangle implements shape
{
	public void drawshape()
	{
		System.out.println("shape rectangle");
	}
   
}
class  square implements shape{
	public void drawshape()
	{
		System.out.println("shape square");
	}
}
class factoryshape{
	public shape getshape(String shapetype)
	{
		if (shapetype==null)
		{
			return null;
		}
		else if(shapetype.equalsIgnoreCase("circle")) {
			return new circle();
		}
		else if (shapetype.equalsIgnoreCase("rectangle"))
		{
			return new rectangle();
		}
		else {
			return null;
		}
	}
}
public class Factorypatterntest {

	public static void main(String[] args) {
		factoryshape factory = new factoryshape();
		shape shape1 = factory.getshape("circle");
             shape1.drawshape();
         shape shape2 = factory.getshape("rectangle");
            shape2.drawshape();
	}

}
