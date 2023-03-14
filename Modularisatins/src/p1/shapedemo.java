package p1;
import java.util.Scanner;
public class shapedemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    shape c = new cuboid();
      c.l = s.nextDouble();
      c.b = s.nextDouble();
      c.h = s.nextDouble();
    System.out.println(c.findvolume());
	}

}
