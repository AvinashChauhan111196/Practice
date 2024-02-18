package core;

public class Demo{

	int studentId = 5;
	
	public static void main(String[] args)
	{
	
	Student s1 = new Student();
	
	s1.studentName = "ram";
	s1.studentId = 1;
	s1.studentCity = "mumbai";
	
	s1.study();
	s1.showDetails();
	
	Student s2 = new Student(2);
	
	s2.studentName = "sam";
	s2.studentId = 2;
	s2.studentCity = "delhi";
	
	s2.study();
	s2.showDetails();
	
	}
}
