class Solution {
    public void moveZeroes(int[] nums) {
       int a=0;
       int temp=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            temp=nums[i];
            nums[i]=nums[a];
            nums[a]=temp;

            a++;
        }
       } 
    }
}