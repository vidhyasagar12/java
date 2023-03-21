package harish;

public class Cheese extends Substance {

	Cheese(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public String getingredients()
	{
		return super.getingrdiants()+"Added"+"cheese";
	}
  public String getsize()
  {
	  return super.getsize();
  }
  public String getprice()
  {
	  return super.getprice()+60;  }
}
