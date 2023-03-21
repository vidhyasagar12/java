package harish;

public class Demopizza {

	public static void main(String[] args) {
		
         Vegpizza vp = new Vegpizza();
         System.out.println(vp.getingrdiants());
         System.out.println(vp.getsize());
         System.out.println(vp.getprice());
         Substance s = new Cheese(vp);
         System.out.println(s.getsize());
         System.out.println(s.getingrdiants());
         System.out.println(s.getprice());
         
	}

}
