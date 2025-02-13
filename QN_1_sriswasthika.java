// Factorial of given number 
import java.util.*;
class Main { 
	static int fact(int n) 
	{ 
		if (n == 0) 
			return 1; 

		return n * fact(n - 1); 
	} 

	public static void main(String[] args) 
	{ 
    Scanner sc=new Scanner(System.in);
		int num = sc.nextInt(); 
		System.out.println("Factorial of " + num + " is " + fact(num)); 
	} 
}
