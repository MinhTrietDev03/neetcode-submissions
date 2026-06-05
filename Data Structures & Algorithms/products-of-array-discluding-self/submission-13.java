class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //create một mảng kết quả
        int[] res = new int[nums.length];

        //gán tát cả là 1
        for(int  i =0 ; i <nums.length ; i++){
            res[i] =1 ;
        }

        // create prefix lưu tích bên trái
        int prefix =1 ;

        //duyệt từ tráu sang phải
        for(int i =0 ; i <nums.length; i++){
            
            //gán tihcs bên trái vòa res[i]
            res[i] = prefix;
            //cập nhật prefix
            prefix *= nums[i];
        }

        //craete one variable save tích bên right
        int postfix = 1;

        //duyệt từ phải sáng trái
        for(int i = nums.length -1 ; i>=0 ;i --){
            //nhân them tihcs bên phải
            res[i] *= postfix;
            //cập nhật postfix
            postfix *= nums[i];
        }
        return res;
    }
}  
