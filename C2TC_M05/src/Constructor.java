
class student
{
	int id;
	String name;
	String course;
	String email;
	student()
	{
		                 // In parameterized constructur we have to define it in class 
		                 // In default constructur JVM wil automatically define in class
	}

  public student(int id, String name, String course, String email) {
		
		this.id = id;
		this.name = name;            //this is a reference variable pointing to its own class 
		this.course = course;
		this.email = email;
	}


public void display()
 {
	 System.out.println("Student Information :");
	 System.out.println(id+" "+name+" "+course+" "+email);
 }
}
public class Constructor {

	public static void main(String[] args) {
		student s1=new student();
		s1.id=1;
		s1.name="Harsh";
		s1.course="java";
		s1.email="sdfgh";
		s1.display();
		
		student s2 = new student(2,"ritik","java","fghjk");
		s2.display();
		

	}

}

