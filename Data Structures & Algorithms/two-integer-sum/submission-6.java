class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //Loop
        for(int i = 0 ; i< nums.length; i++){
            
            //create complement
            int complement = target - nums[i];

            // kiểm tra arr có chưa contains
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            // nếu chưa có 
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}


// careta hashMap
//Duet các phần tử trong mảng
//in complement =  target - nums[i]
//kỉem tra mang đã chưa complemnt hay chưa
// return ve so con thieu và vị trí của nó trong mảng
// nếu chưa có thì thêm nó và bị trí của nó
// return một mảng mới new int[]{}