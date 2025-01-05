import java.util.*;
public class Main{
public static void main(String[] args){
  int a=3;
  System.out.print(factorial(a));//3*2*1 = 6
}
  public static int factorial(int a){
    if(a==0) return 1;
    return a*factorial(a-1);
  }
}
