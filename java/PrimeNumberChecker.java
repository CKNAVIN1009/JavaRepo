package assignment;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        int[] testNumbers = {91,92,93,94,95,96,97,98,99,100};
        for (int num : testNumbers) {
            System.out.println(num + " prime " + Prime(num));
        }
    }
    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
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
}