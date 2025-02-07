class Solution {
  public static void main(String args[])
  {
      int n=125;
      int count = hammingWeight(n);
      System.out.println(count);
  }
  
  public static int hammingWeight(int n) {
        int a=0;
        while(n>0)
        {
            if(n%2==1) a+=1;
            n/=2;
        }
        return a;
    }
}
