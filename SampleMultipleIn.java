package Assessment1;

public class SampleMultipleIn 
{
public static void main(String[] args) 
{ 
	Sample1 s1=new Sample1();
	s1.addd();
	
	 
	
}
class Sample1
{
	int a=10;
	int b=20;
	void addd()
	{
		int c=a+b;
		System.out.println(c);
	}
class Sample2 extends Sample1
{
	void subb()
	{
		int d=b-a;
		System.out.println(d);
	}
	
}
//doesnt support multipleinheritance
class Sample3 extends Sample1,Sample2
{
	void mul()
	{
		int e=a*b;
		System.out.println(e);
	}
	
}
 
}

