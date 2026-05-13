class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // tạo 1 HashMap 
        HashMap<Integer, Integer> map = new HashMap<>();

        // duyet cac phan tu co trong mang

        for(int i = 0 ; i < nums.length; i++ ){

            // Kiêm tra xem complement có tồn tại hay chưa
            int complement = target - nums[i];
            if(map.containsKey(complement)){
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
        }
        
        return new int[]{};
    }
    
}
