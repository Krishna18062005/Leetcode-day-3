class main{
  public static void main(String[] args){
     System.out.println(reverseString("Krishna"));//anhsirK;
     System.out.println(reverseString("Github")); //buhtiG;
  }
  public static String reverseString(String st){
    if(st.length()==1) return st.charAt(0)+"";
    return reverseString(st.substring(1))+st.charAt(0);
  }
}
