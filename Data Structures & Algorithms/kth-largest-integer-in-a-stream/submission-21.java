class KthLargest {
    // tạo minheap dùng để lưu top k phần tử liwns nhất
    private PriorityQueue<Integer> minHeap;

    // biên k lưu vị trí KthLargest
    private int k;

    // hàm KthLargest
    public KthLargest(int k, int[] nums) {
        // gán giá trị k cho biến global
        this.k = k;

        // tạo minHeap
        minHeap = new PriorityQueue<>();

        // dueyt qua các phần tử
        for (int num : nums) {

            minHeap.offer(num);
            // nếu độ dài của minHeap vượt quá k
            // sẽ xóa phần tử đí đi
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    // hàm add
    public int add(int val) {
        // thêm các số vào stream
        minHeap.offer(val);
        // nếu số vượt quá k thì xóa đi số đó
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
