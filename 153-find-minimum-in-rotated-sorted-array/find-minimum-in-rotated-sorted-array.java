class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right) {
            int mid = left + (right-left)/2;

            if(nums[mid] > nums[right]) {//Minimum right side main h
                left = mid+1;
            }
            else {
                right = mid; // Minimum left side ya mid par
            }
        } 
        return nums[left];
    }
}