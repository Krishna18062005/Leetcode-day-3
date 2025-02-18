import java.util.*;
public class FibonacciNumbers{
public static void main(String args[]){
int a=-1,b=1,c=0,N;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Fibonacci numbers to generate (N):");
N=sc.nextInt();
System.out.println("First "+N+" Fibonacci numbers");
for(int i=0;i<N;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}}
