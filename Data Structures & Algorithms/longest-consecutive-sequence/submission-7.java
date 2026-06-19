class Solution {
    public int longestConsecutive(int[] nums) {
        // createa Hashset để lưu toàn bộ số trong mảng
        Set<Integer> set = new HashSet<>();

        // đưa các nums vào hashset
        for (int num : nums) {
            set.add(num);
        }

        // lưu độ dài lướn nhất vừa tìm được
        int longest = 0;

        // duyệt qua HashSet
        //  duyetj qua set để bỏ qua kiêm tra trùng lặp
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;

                // kiểm tra num+1 , num+2 có tồn tại không
                while (set.contains(num + length)) {
                    length++;
                }
                // update result lớn nhất
                longest = Math.max(longest , length);
            }

           
        } 
        return longest;
    }
}
