package harish;

public class Nonvegpizza implements Pizza{

	@Override
	public String getsize() {
		// TODO Auto-generated method stub
		return "the size of the nonveg pizza"+"large";
	}

	@Override
	public String getingrdiants() {
		// TODO Auto-generated method stub
		return "ingredients are nonveg";
	}

	@Override
	public String getprice() {
		// TODO Auto-generated method stub
		return "the price is"+300;
	}

}
