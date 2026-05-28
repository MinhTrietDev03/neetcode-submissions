/*
b1:create minHeap để lưu phần tử lớn nhất
b2:biến k để lưu vị trí khtlarcgest
b3: tạo hàm kthlargest
-gán biến k cho global
-tạo minHeap
b4:duet cac phàn tu trong nums
-đưa cào minhHeap
-nếu  sô lượng phần tử vượt ququá k
- thì poll() xóa phần tử nhỏ nhất
b5: create hàm adđ
-đưa số mới vào heap
-kiểm tra xem só phần tư có vutowj quá k khonng
-polll phần tử nhỏ nhất

b6: phần tử đứng đầu heap chính là kth larget


*/

class KthLargest {
    private PriorityQueue<Integer> minHeap;

    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
