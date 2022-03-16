interface PerfectSquare{
	boolean test(int n);
}

public class VRGitDemo
{
	public static void main(String[] args)
	{
		PerfectSquare s = (int num) -> Math.sqrt(num) == Math.floor(Math.sqrt(num));
		System.out.println(s.test(144));
	}
}