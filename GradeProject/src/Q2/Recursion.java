package Q2;
import java.util.Scanner;
public class Recursion {
	 static int toFindPower(int x, int n) {
	        if (n == 0) {
	            return 1;
	        } else if (n < 0) {
	            return -1;
	        } else {
	            return x * toFindPower(x, n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the base number X: ");
	        int x = sc.nextInt();
	        System.out.println("Enter the power N: ");
	        int n = sc.nextInt();
	        System.out.println("X power N is: " + toFindPower(x, n));
	        sc.close();
	    }
	}


