package assessment;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	//scanner used to take dynamic input values when needed
		System.out.println("Enter a positive number: ");
		int number=scan.nextInt();
		scan.close();
		int i,flag=0;
		int m=number/2;
		if(number==0 || number==1) {
			System.out.println("The number "+number+" is not a prime number");
		}
		for(i=2;i<=m;i++) {
			if(number%i==0) {
				System.out.println("The number "+number+" is not a prime number");
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println("The number "+number+" is  a prime number");
			}
			
		}
	}

