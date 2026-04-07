class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums); // sort the array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();

        //fix one element and use two pointer approach for the rest

         for(int i=0; i<n-3; i++)
          {
            for(int j=i+1; j<n-2; j++) {
          
            int low = j+1;
            int high = n-1;

            while(low < high) {
                long sum = (long) nums[i] +nums[j] + nums[low] + nums[high];

                if(sum == target) {
                    //store triplet in set to avoid duplicates
                    s.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                    low++;
                    high--;
                } else if(sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
         }
          }
         //Transfer set element to find result list
         ans.addAll(s);
         return ans;
    }
}