package Package_1;

public class MethodThis {
	public void method1()
	{
		System.out.println("Default Method");
		this.method1(3);
	}
	public void method1(int a)
	{
		System.out.println("One Parameterized Method");
		this.method1(3,4);
	}
	public void method1(int a,int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void method1(int a,int b, int c)
	{
		System.out.println("Three Parameterized Method");
		this.method1(1,2,3,4);
	}
	public void method1(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
		this.method1();
	}
	public static void main(String[] args) {
		MethodThis resv = new MethodThis();
		resv.method1(3,4,5);
	}
	

}
