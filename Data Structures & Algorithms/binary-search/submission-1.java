class Solution {
    public int search(int[] nums, int target) {
        

        // tạo một vị trí ở đầu mảng
        int left = 0 ;
        
        // tạo một vị trí ở cuối mảng
        int right = nums.length -1;

        //Lặp các vẫn còn có có thể tìm
        while(left <= right){

            // tính vị trí ở giữa
            int mid = left + (right -left) / 2;

            // Nếu không tìm thấy ở target

            if(nums[mid] == target){
                return mid;
            }
            
            //Nếu giá tị ở giữa nhỏ hơn target
            // thì tar get nằm ở bên phải
            else if(nums[mid] < target){
                left = mid +1;
            }


            //nếu giá trị mid luôn lớn hơn target thì target luôn nằm bên trái
            else{
                right = mid -1 ;
            }
        }

        // không tìm thấy 
        return -1;
    }
}
