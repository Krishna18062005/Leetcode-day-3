import java.util.*;
class a{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    int count=0;
    char arr1[]=str1.toCharArray();
    char arr2[]=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]==arr2[i]){
        count++;
      }
    }
    if(count==arr1.length)
      System.out.println("anagram");
    else
      System.out.println("Not Anagram");
  }
}
