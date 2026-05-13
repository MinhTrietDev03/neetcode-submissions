class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Noi de lu ca phan tu

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num); // chua co thi them vao hash
        }
        return false;
    }
}