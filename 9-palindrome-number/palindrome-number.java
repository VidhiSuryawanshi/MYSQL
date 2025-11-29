class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int check = reverce(x);
        if(x==check){
            return true;
        }
        return false;
    }

    public int reverce(int n){
        int rev=0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
}