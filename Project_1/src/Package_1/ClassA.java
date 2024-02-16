package Package_1;

public class ClassA {
	int rollno;
	int age;
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		{
			ClassA S1=new ClassA();
			S1.Display1();
			S1.Display2();
			S1.rollno=18;
			System.out.println("Roll no of S1 is"+S1.rollno);
			S1.age=15;
			System.out.println("Age of S1 is"+S1.age);
		}
	}

}
