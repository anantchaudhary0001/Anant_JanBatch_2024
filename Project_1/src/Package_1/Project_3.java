package Package_1;

public class Project_3 {
	public float div(float a, float b)
	{
		float c = a/b;
		return c;
	}
	public float sub(float d, float e)
	{
		float f = d-e;
		return f;
	}
	public float sum(float x, float y)
	{
		float z = x+y;
		return z;
	}
	public static void main(String[] args) {
		Project_3 calc = new Project_3();
		float div = calc.div(10, 2);
		float sub = calc.sub(div, 2);
		float sum = calc.sum(sub, 2);
		float sub2 = calc.sub(sum, 2);
		float div2 = calc.div(sub2, 2);
		System.out.println("Result"+div2);
	}

}
