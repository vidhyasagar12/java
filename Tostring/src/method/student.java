package method;

public class student {
	int id;
	String name;
	int marks,gpa;
student(){
	this.id = 100;
	this.name ="vidhya";
	this.marks = 100;
	this.gpa = 10;
}
public String toString()
{
	return(id+name+marks+gpa);
}
	public static void main(String[] args) {
	student s = new student();
	System.out.println(s);

	}

}
