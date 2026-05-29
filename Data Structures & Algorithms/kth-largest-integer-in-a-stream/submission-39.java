class KthLargest {

    // tạo một min heap
    // một hàm chỉ 
    private PriorityQueue<Integer> minHeap;

    //tạo biến k để lưu kthlargest
    private int k;

    public KthLargest(int k, int[] nums) {
        
        //gán giá trị k
        this.k= k ;

        //tạo mọt minHeap
        minHeap = new PriorityQueue<>();

        //duyệt qua các pahafn tử hiện tạivà đưa nó vào minHeap
        for(int num : nums){
            minHeap.offer(num);

            // nếu số lượng phần tử vượt quá k
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

    }
    
    public int add(int val) {
        minHeap.offer(val);
        // nếu phần tử vượt quá k
        if(minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
    
}
