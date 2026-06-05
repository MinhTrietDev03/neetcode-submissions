class Solution {
    public int[] productExceptSelf(int[] nums) {
        // tạo một mảng kết qua

        int[] res =  new  int[nums.length];

        //gán tất cả bằng 1
        for(int i = 0 ; i< nums.length ; i++){
            res[i]= 1; 
        }

        //lưu tích bên trái 
        int prefix =1 ;

        //duyêt từ trái sang pahir 
        for(int i =0; i< nums.length ; i++){
            //gán tích avof bên trái res
            res[i] = prefix;

            // cập nhât prelix 
            prefix *= nums[i];

        }


        // luu tihcs bên phỉa 
        int postfix = 1;

        // duyệt từ pahir sang trái
        for(int i = nums.length - 1; i >= 0 ; i --){

            //nhân thêm tích bên phải
            res[i] *= postfix;

            //cập nhật postfix
            postfix *= nums[i];
        }
        return res;
    }
}  
