package dmo;
abstract class emp1
{
	String name;
	long id;
	abstract void confindential(int sal, String perf);
    void display(String name,long id)
    {
    	this.name = name;
    	this.id = id;
    	System.out.println(name+id);
    }
}
class HR extends emp1
{
	int sal;
	String perf;
	void confindential(int sal, String perf)
	{
		this.sal = sal;
		this.perf = perf;
		System.out.println(sal+perf);
	}
}
 public class emp {

	public static void main(String[] args) {
HR obj = new HR();
obj.display("vidhya",101);
obj.confindential(100000,"Good");

	}

}
