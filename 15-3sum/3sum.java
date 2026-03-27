class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // sort the array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
       
       //fix one element and use two pointer approach for the reset
        for(int i=0; i<n-2; i++) {
            int low = i+1;
            int high = n-1;

            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if(sum == 0) {
                // store triplet in set to Avoid duplicate
                    s.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if(sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        // Transfer set element to final result list
        ans.addAll(s);
        return ans;
    }
}