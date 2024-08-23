package assessment;

public class Final {
	public static void main(String[] args) {
		Finallydemo finallydemo = new Finallydemo();
		finallydemo.test();
		FinalKeyword finalKeyword = new FinalKeyword();
		finalKeyword.finalmethod();
		finalKeyword.finalVairable();
	}	
}
	class Finallydemo {
		void test() {
		try {
			System.out.println("try this code with catch");
		}
		finally {
			System.out.println("Defaulty executed finally");
		}
	}
	}

	final  class FinalKeyword {
		
		final public void  finalmethod () {
			System.out.println("this method can't be overriden");
		}
		void finalVairable() {
			System.out.println("the variable value is can't incremented");
			System.out.println("final class can't be extended");
		}
}