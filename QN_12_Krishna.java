class main{
  public static void main(String[] args){
    
    //Check if a string is a palindrome. //same word when we read in both sides..
    String str1="MalayalaM";
    String str2="Krsi";
     System.out.println(str1.equals(reverseString(str1)));//true;
     System.out.println(str2.equals(reverseString(str2))); //false;
  }
  public static String reverseString(String st){
    if(st.length()==1) return st.charAt(0)+"";
    return reverseString(st.substring(1))+st.charAt(0);
  }
}
