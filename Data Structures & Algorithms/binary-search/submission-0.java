class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            // tìm vị trí giữa
            int mid = left + (right - left) / 2;

            // tìm thấy
            if (nums[mid] == target) {
                return mid;
            }

            // target lớn hơn mid
            else if (nums[mid] < target) {
                left = mid + 1;
            }

            // target nhỏ hơn mid
            else {
                right = mid - 1;
            }
        }

        // không tìm thấy
        return -1;
    }
}