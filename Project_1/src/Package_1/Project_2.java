package Package_1;

public class Project_2 {
	public int sum(int x,int y)
	{
		int z = x+y;
		return z;
	}
	public int sub(int a,int b)
	{
		int c = a-b;
		return c;
	}
	public int mul(int p,int q)
	{
		int s = p*q;
		return s;
	}
	public int div(int e,int f)
	{
		int g = e/f;
		return g;
	}
	public static void main(String[] args) {
		Project_2 calc=new Project_2();
		int sum1 = calc.sum(10, 2);
		int sum2 = calc.sum(sum1, 2);
		int sub = calc.sub(sum2, 2);
		int mul = calc.mul(sub, 2);
		int div = calc.div(mul, 2);
		System.out.println("Result"+div);
	}

}
