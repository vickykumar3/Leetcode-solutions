class Solution {
    public int search(int[] nums, int target) {
    int n = nums.length;
    int low = 0;
    int high = n - 1;
     
     while(low <= high) {
        int mid = (low + high) / 2;
        
        // If target is found at mid
        if(nums[mid] == target)
        return mid;

        //check if the left half is sorted
        else if (nums[low] <= nums[mid]) {
            //If target is in left half
            if (target >= nums[low] && target <= nums[mid])
            high = mid;
            else
            low = mid + 1;
        }
        //Right half is sorted
        else {
            // If target is in the right half
            if (mid + 1 <= high && target >= nums[mid + 1] && target <= nums[high])
            low = mid + 1;
            else
            high = mid;
        }
     }
     // Target not foun
     return -1;
    }
}