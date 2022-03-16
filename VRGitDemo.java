
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
		/*
			SYDNEY
			I have a better understanding of how repositories and GitKraken work, and I know how to make
			branches and merge them. In addition, I am aware of how to push and pull new updates to and from a
			partner. Communication was also a vital part in completing this project because Anisha and I
			both ran into problems and had to collaborate to figure out how to fix them.
		*/
		//PERFECT SQUARE
		PerfectSquare s = (int num) -> Math.sqrt(num) == Math.floor(Math.sqrt(num));
		System.out.println(s.test(144));

	}
}