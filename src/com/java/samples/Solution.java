package com.java.samples;

class Solution {
    // LC# 1 TWO SUM
       public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    // LC # 9 Palindrome Number
    public boolean isPalindrome(int x) {
        if(x<0){
           return false;
        }
        int dup=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(dup==rev){
            return true;
        }
        return false;
    }
}
