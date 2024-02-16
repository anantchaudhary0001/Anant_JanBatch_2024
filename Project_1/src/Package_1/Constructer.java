package Package_1;

public class Constructer {
	public Constructer()
	{
		this(2,3,4);
		System.out.println("Default Constructer");
	}
	public Constructer(int a)
	{
		this();
		System.out.println("One parameterized constructer");
	}
	public Constructer(int a,int b)
	{
		this(2);
		System.out.println("Two parameterized constructer");
	}
	public Constructer(int a,int b,int c)
	{
		System.out.println("Three parameterized constructer");
	}
	public Constructer(int a,int b,int c,int d)
	{
		this(2,3);
		System.out.println("Four parameterized constructer");
	}
	public void display()
	{
		System.out.println("Final Result");
	}
	public static void main(String[] args) {
		Constructer resv = new Constructer(2,3,4,5);
		resv.display();
	}
	

}
