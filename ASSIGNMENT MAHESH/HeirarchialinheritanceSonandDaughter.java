package assessment;

public class HeirarchialinheritanceSonandDaughter {
	public static void main(String[] args) {
		System.out.println("heirarchical inheritance");
		Daughter daughter = new Daughter();
		daughter.ParentBio();
		daughter.DuagtherBio();
		Son son= new Son();
		son.ParentBio();
		son.SonBio();
	}
	}
class Parent{
	String name="mahesh";
	int age=55;
	void ParentBio() {
		System.out.println("Here's the "+name+" ");
	}
}

class Son extends Parent{
	String name="revanth";
	int age =23;
	void SonBio() {
		System.out.println("Here's the "+name+" ");
		System.out.println("i'm "+age+" years older");
	}
}

class Daughter extends Parent{
	String name="Jimmy";
	int age=19;
	
	void DuagtherBio() {
		System.out.println("Here's the "+name+" ");
		System.out.println("i'm "+age+" years older");
	}
}
