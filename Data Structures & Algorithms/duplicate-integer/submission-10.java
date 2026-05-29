class Solution {
    public boolean hasDuplicate(int[] nums) {
        //create hash
        HashSet set = new HashSet<>();

        //đi qua các pahafn tử trong mảng
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}