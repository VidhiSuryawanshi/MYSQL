class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num : nums){
            if(digitcount(num)%2==0){
                even++;
            }
        }
        return even;
    }

    public int digitcount(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}