class main{
  public static void main(String[] args){
     System.out.println(fact(0));//1;
     System.out.println(fact(5));//120;
  }
  public static int fact(int a){
    if(a==0) return 1;
    return a*fact(a-1);
  }
}
