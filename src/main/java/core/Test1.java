package core;

// Example of inheritance and multiple inheritance

public class Test1 extends Test2 {

	void test1()
	{
		System.out.println("The method is from test1 ");
	}
	
	public static void main(String args[])
	{
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
		// Test1 t12 = (Test1) new Test2();
		Test44 t44 = new Test44();
		t44.test4();
		t44.test44();
		
		// interface object is able to call its method with reference to implemented class
		Test4 t4 = new Test44();
		t4.test4();
		
		
		
	}
}

class Test2 extends Test3 {
	
	void test2()
	{
		System.out.println("The method is from test2 ");
	}
}

class Test3{
	
	void test3()
	{
		System.out.println("The method is from test3 ");
	}
}

interface Test4 {
	
	void test4();
}


class Test44 implements Test4 {
	
	void test44()
	{
		System.out.println("The method is from test44");
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("The method is from test4 ");
		
	}
}
