
interface Quotient //interface for quotient
{
	void quo(float a, float b);
}

interface PerfectSquare{
	boolean test(int n);

}

public class VRGitDemo
{
	public static void main(String[] args)
	{

		//QUOTIENT
		Quotient q = (float a, float b) -> System.out.printf("%.3f", a/b);
		q.quo(5f, 2f);

		//PERFECT SQUARE
		PerfectSquare s = (int num) -> Math.sqrt(num) == Math.floor(Math.sqrt(num));
		System.out.println(s.test(144));

	}
}