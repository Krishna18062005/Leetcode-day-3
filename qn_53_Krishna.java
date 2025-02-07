class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false; // edge case for negative numbers

        //by consecutive dividing by 2;
        // while(n%2==0){
        //     n/=2;
        // }
        // return n==1;

        // using right shift 
        // while(n%2==0){
        //     n>>=1;
        // }
        // return n==1;
        
        //8&(8-1) ... 8&7==0 ... 1000&0111==0... it will be power of two..
        return (n&(n-1))==0;
    }
}
