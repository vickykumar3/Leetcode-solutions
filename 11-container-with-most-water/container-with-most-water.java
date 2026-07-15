class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;

        int maxArea = 0;

        while(left < right) {   // TC O(n) && Sp O(1)

            int width = right - left;

            int area = Math.min(height[left], height[right]) * width;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
         return maxArea;
    }
}