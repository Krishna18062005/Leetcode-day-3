import java.util.*;
public class FactorialUsingRecursion {
    public static int recursion(int n) {
        if(n-1 == 0) {
          return 1;
        }
        return n * recursion(n-1);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = recursion(n);
        System.out.print("The factorial of "+n+" is "+answer);
    }
}
