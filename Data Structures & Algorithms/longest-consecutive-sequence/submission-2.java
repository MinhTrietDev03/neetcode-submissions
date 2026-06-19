class Solution {
    public int longestConsecutive(int[] nums) {
        
        // tạo HashSet ddeer lưu tonaf bộ các số có trong mảng
        Set<Integer> set = new HashSet<>();

        //Duyệt qua nums đưa các phần tử vào HashSet
        for(int num: nums){
            set.add(num);
        }

        // lưu độ dài lớn nhất tìm được
        int longest = 0 ;

        //duyệt từn số trong HashSet
        for(int num :set){

            // nếu num-1 không tồn tại 
            // num chính là điển bắt đầu một dãy liên tiếp
            if(!set.contains(num -1)){
                
                //độ dài hiện tại
                int length = 1;

                // kiểm tra xem num+1, num+2,... có tồn tại không
                while(set.contains(num + length)){
                    length ++;
                }

                // update result lớn nhất
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
