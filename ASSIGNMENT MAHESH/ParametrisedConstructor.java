package assessment;
public class ParametrisedConstructor {
	public static void main(String[] args) {
	Student student = new Student("Deepu",589,78.2);
	student.displayDetails();
	}
	}
	class Student {
		String name;
		int rollNumber;
		double marks;
		Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		}
		public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: " + marks);
		}
	}

