package Assessment1;

public class Variables 
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.add();

		
	}
}
	class Addition
	{
		//instance variable
	String name="Harsha";
	int a=53;
	int b=28;
	void add()
	{//local variable
		int c=20;
		int sum=a+b;
		System.out.println(sum);
		System.out.println(name);
		System.out.println(c);
		}
	}

