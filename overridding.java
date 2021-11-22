class abcd
{
	void sum()
	{
		System.out.println("in abc...");
	}
}
class pqr extends abcd
{
	void sum()
	{
		System.out.println("in pqr...");
	}
}
public class overridding
{
	public static void main(String args[])
	{
		abcd a = new abcd();
		pqr b = new pqr();
		a.sum();
		b.sum();
	}
}