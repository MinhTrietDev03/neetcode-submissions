class KthLargest {
    // tạo min Heap để luuw phần tử lớn nhất
    private PriorityQueue<Integer> minHeap;

    // biến lưu trữ giá trị k
    private int k;

    // Contructer
    private KthLargest(int k, int[] nums) {
        this.k = k;

        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    // contructer add
    public int add(int val) {
        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
