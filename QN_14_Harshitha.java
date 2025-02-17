import java.util.*;
class vowels {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char a[]=str.tocharArray();
    for(int i=0;i<a.length;i++){
      if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
        a[i]="";
      }
      else{
        continue;
      }
    }
  }
}
