class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<> ();
        boolean op = false;
        for(int num : nums){
            if(seen.contains(num)) {
                op = true;
                break;
            }
            seen.add(num);
        }
        return op;

    }
}