package assessment;

public class Constructor_args {
	
	Constructor_args(int a,int b){
		int c=a+b;
		System.out.printf("Sum of two args %d %d  are %d",a,b,c);
	}
	public static void main(String[] args) {
		Constructor_args ag=new Constructor_args(10,20);
}
}
