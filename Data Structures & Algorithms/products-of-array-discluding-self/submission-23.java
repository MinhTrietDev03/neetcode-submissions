class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //create res[] 
        int[] res = new int[nums.length];

        //duyetj qua cac pahn tu
        for(int i =0 ; i <nums.length ; i++){

            res[i] =1;
        }

        //create variable save left
        int prefix = 1;
        for(int i = 0 ; i< nums.length ; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }

        // create variable save right
        int postfix =1;
        for(int i = nums.length -1 ; i>=0 ; i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
