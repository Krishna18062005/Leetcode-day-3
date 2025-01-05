import java.util.*;

public class Main {
    public static void main(String[] args) {
      //Count no of digits in a Number 
      //Using Math 
      int num=1009;
      System.out.println((int)Math.log10(num)+1);//op 4
      //while loop 
      int count =0;
      while(num>0){
        num/=10;
        count++;
      }
      System.out.println(count);
      num=1009;
      //Inbuild Function Using String length
      System.out.println((num+"").length());
  }
}
