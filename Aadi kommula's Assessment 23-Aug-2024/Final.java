package assessment;

class Finallydemo {
	void test() {
	try {
		System.out.println("try this code with catch block");
	}
	finally {
		System.out.println("Defaulty executed finally block");
	}
}
}

final  class FinalKeyword {
	
	final public void  finalmethod () {
		System.out.println("this method can't be overriden");
	}
	void finalVairable() {
		final int a=90;
		System.out.println("the variable a value is can't incremented");
		System.out.println("final class can't be extended");
		
		//	a++;  throws error that's why commented
		
			}
}

public class Final{
	public static void main(String[] args) {
		Finallydemo finallydemo = new Finallydemo();
		finallydemo.test();
		FinalKeyword finalKeyword = new FinalKeyword();
		finalKeyword.finalmethod();
		finalKeyword.finalVairable();
	}
	
}
