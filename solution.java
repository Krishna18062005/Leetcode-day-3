class Solution {//leetcode score of a string 3110
    public int scoreOfString(String s) {
        
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return sum;
    }
}
