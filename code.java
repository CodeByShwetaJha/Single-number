class Solution {
    public int singleNumber(int[] nums) {
        int one=0,two=0,three;
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            two=two |(one&b);
            one=one^b;
            three=~(one&two);
            one&=three;
            two&=three;
        }
   return one;  
        
    }
    
}
