interface Quotient //interface for quotient
{
	void quo(float a, float b);
}

public class VRGitDemo
{
	public static void main(String[] args)
	{
		//QUOTIENT
		Quotient q = (float a, float b) -> System.out.printf("%.3f", a/b);
		q.quo(5f, 2f);
	}
}