package assessment;
public class MethodOverriding {
	public static void main(String[] args) 
	{
		Mahesh a1=new Mahesh();
		a1.sum(4,5,8);
		a1.sum(89,54);
	}
	}
	class Mahesh
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
