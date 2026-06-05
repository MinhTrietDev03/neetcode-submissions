class Solution {
    public int[] productExceptSelf(int[] nums) {
        // tạo một mảng kết quả
        int[] res = new int[nums.length];

        //gán tất cả = 1

        for(int i = 0 ; i< nums.length; i++){
            res[i] = 1;
        }
        // lưu tích bên trái 
        int prefix  = 1;

        //duyet từ trái sang pahir
        for(int i =0; i< nums.length ; i++){

            //res[i] nhân tích các phần tử bên trái
            res[i] = prefix;

            //cập nhật prefix
            prefix *= nums[i];
        }

        //lưu tích bên pahir
        int postfix = 1;

        //duyệt từ pahir sang trai
        for(int i = nums.length -1 ; i>= 0 ; i--){
            
            //nhận thêm tihcs bên phải
            res[i] *= postfix;

            // cập nhật postfix
            postfix *= nums[i];
        }
        return res;
    }
}  
