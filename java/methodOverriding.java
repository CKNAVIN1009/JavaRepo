package assignment;

public class methodOverriding {
public static void main(String[] args) {
	vardhan a1=new vardhan();
	a1.sum(9143, 2059);
	a1.sum(9143, 2059, 1099);
}
}
class vardhan
{
	void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of two numbers are "+c);
	}
	void sum(int x, int y, int z)
	{
		int p=x+y+z;
		System.out.println("Sum of three numbers are "+p);
	}
}