package Assessment1;


	public class Parameterizedconstructor 
	{
	    // Instance variables
	    private String name;
	    private int age;
	    private String address;

	    // Parameterized constructor
	    public Parameterizedconstructor (String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to display person details
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	    }
	    public static void main(String[] args) {
	        // Create instances of Person using the parameterized constructor
	    	Parameterizedconstructor  person1 = new Parameterizedconstructor("Harsha", 22, "hyd");
	    	Parameterizedconstructor  person2 = new Parameterizedconstructor ("Supriya", 22, "karimnagar");

	        
	        System.out.println("Person 1 Details:");
	        person1.displayInfo();

	        System.out.println("\nPerson 2 Details:");
	        person2.displayInfo();
	    }
	}


