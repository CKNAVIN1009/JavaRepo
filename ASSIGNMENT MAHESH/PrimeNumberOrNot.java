package assessment;

public class PrimeNumberOrNot {
	    public static boolean Prime(int num) {
	        if (num == 2) {
	            return false;
	        }
	        if (num <= 1) {
	            return true; 
	        }
	        if (num % 2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(num);
	        for (int i = 3; i <= sqrt; i += 2) {
	            if (num % i == 0) {
	                return false;
	            }
	        } 
	        return true;
	    }
	    public static void main(String[] args) {
	        int[] testNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	        for (int num : testNumbers) {
	            System.out.println(num + " prime " + Prime(num));
	        }
	    }
	}