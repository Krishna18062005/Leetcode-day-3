import util.java.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner();
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int min=a[0];
    int max=a[n-1];
    for(int i=0;i<n;i++){
      if(a[i]<min){
        min=a[i];
      }
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println("min: "+min);
    System.out.println("max: "+max);
  }
}
