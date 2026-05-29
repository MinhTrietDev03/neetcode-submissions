class KthLargest {

    // create minHeap để lưu phần tử lớn nhất
    private PriorityQueue<Integer> minHeap;

    //tạo biến k lưu vị trí của KthLargest
    private int k;

    public KthLargest(int k, int[] nums) {
        
        //gán biến hiện tại = k
        this.k=k;
        //tạo minHeap
        minHeap= new PriorityQueue<>();

        //duyet cac phan tu trong nums
        for(int num: nums){

            //thêm phần tử cào heap
            minHeap.offer(num);

            //nếu số lượng vượt quá k thì chỉ lấy phần tử đầu và xoa phần tử nhỏ nhất

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

    }
    
    public int add(int val) {
        
        //đưa các sao vòa heap
        minHeap.offer(val);

        //neu heap vươt qua so ohafn tu k
        if(minHeap.size() >k){
            minHeap.poll();
        }

        // phần tử đầu heap chính là kth largest
        return minHeap.peek();
    }
}
