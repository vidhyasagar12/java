package p1;

public abstract class shape {
	double l,b,h;
	abstract double findvolume();
	public String tostring()
	{
		return ("l="+l+"b="+b+"h="+h);
	}

}
