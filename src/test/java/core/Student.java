package core;

public class Student extends Demo {

	int studentId;
	String studentName;
	String studentCity;
	
	
	public Student()
	{
		this(20);
		System.out.println("creating first object");
	}
		
	
	public Student(int id) {
		super();
		System.out.println(" paramerterized object ");
	}
	
	public Student(int i, String studentName, String studentCity) {

		studentId = i;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
		
	
	public void study()
	{
		System.out.println(studentName + " is studying ");
	}
	
	public void showDetails()
	{
		System.out.println("My name is " + studentName);
		System.out.println("My id is " + studentId);
		System.out.println("My city is " + studentCity);
	}
}
