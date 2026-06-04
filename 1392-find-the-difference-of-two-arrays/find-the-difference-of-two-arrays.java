class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();

       for(int val : nums1) {  // O(n)
         set1.add(val);
       }                        

       for(int val : nums2) {  // O(m)
        set2.add(val); 
       }

       HashSet<Integer> ans1 = new HashSet<>();
       for(int val : nums1) {                   // O(n)
        if(set2.contains(val) == false) {
            ans1.add(val);
        }
       }
        HashSet<Integer> ans2 = new HashSet<>();
        for(int val : nums2) {                   // O(m)   Total TC = O(n+m)
            if(set1.contains(val) == false) {
                ans2.add(val);
            }
        }
        return Arrays.asList(new ArrayList<>(ans1), new ArrayList<>(ans2));
    }
}