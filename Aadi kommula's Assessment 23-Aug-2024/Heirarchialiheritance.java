package assessment;

class Parent{
	String name="parent";
	int age=55;
	
	void ParentBio() {
		System.out.println("Here's the "+name+" class");
	}
}

class Son extends Parent{
	String name="Son";
	int age =23;
	
	void SonBio() {
		System.out.println("Here's the "+name+" class");
		System.out.println("i'm "+age+" years older");
	}
}

class Daughter extends Parent{
	String name="daugther";
	int age=19;
	
	void DuagtherBio() {
		System.out.println("Here's the "+name+" class");
		System.out.println("i'm "+age+" years older");
	}
}



public class Heirarchialiheritance {
	public static void main(String[] args) {
		System.out.println("Example for heirarchical inheritance");
		Daughter daughter = new Daughter();
		daughter.ParentBio();
		daughter.DuagtherBio();
		Son son= new Son();
		son.ParentBio();
		son.SonBio();
		
	}

}
