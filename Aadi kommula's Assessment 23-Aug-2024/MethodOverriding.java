package assessment;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		System.out.println("Sample usage of Method Overriding");
		
		//Creating Objects 
		AreaofTriangle triangle=new AreaofTriangle(); //Executes Method of Triangle class
		triangle.Area(10, 15);
		AreaofRectangle rectangle=new AreaofRectangle(); //Executes Method of Rectangle class
		rectangle.Area(10, 40);
		AreaofRectangle aot=new AreaofTriangle(); //Executes Method of Triangle class as  AreaofTriangle(); is reference
		aot.Area(20, 13);
	}

}
//Parent Class 
class AreaofRectangle{
	
	void Area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle is "+area);
		
	}
	
}

//Child Class
class AreaofTriangle extends AreaofRectangle{
	
	void Area(int breadth,int height) {
		double area=0.5*breadth*height;
		System.out.println("Area of Triangle "+area);
	}
}