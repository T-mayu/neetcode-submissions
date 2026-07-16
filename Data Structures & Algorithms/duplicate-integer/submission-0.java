class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
           for(int num : nums){ //traverse hashset
               if(seen.contains(num)){ //if it found duplicate, return true
                   return true;
               }
               seen.add(num);//otherwise add value to hashset
           }
           return false;//boolean function is not true, return false
    }
}