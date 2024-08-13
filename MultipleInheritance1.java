package Assessment1;


public class MultipleInheritance1 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.sample1();
		c1.sample2();
		c1.sample3();
	}
}
	interface A
	{
		default void sample1()
		{
			System.out.println("this is A");
		}
	
	}
	interface B
	{
		default void sample2()
		{
			System.out.println("this is B");
		}
	}
	class C implements A, B
	{
		void sample3()
		{
			System.out.println("this is C acessing A and B");
		}

}
