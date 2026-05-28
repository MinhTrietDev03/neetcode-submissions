class KthLargest {

    //create minHeap to save top k
    private PriorityQueue<Integer> minHeap;

    //create biến k để lưu vị trí KthLargest
    private int k;

    //Contructer KthLargest
    public KthLargest(int k, int[] nums){
        
        //gán k lưu giá trị global
        this.k = k;

        //tạo minHeap
        minHeap = new PriorityQueue<>();

        //Duyệt các phần tử
        for(int num : nums){

            // thêm các phần tử vào minHeap
            minHeap.offer(num);

            //nếu các phần tử vượt quá k
            //thì xóa
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }

    //create contructer add

    public int add (int val){
        //thêm các số
        minHeap.offer(val);
        
        // nếu độ dài số vượt quá k thì poll
        if(minHeap.size() > k){

            //xóa phần tử nhỏ nhất
            minHeap.poll();
        }

        //phần tử đứng đầu chính là KthLargest
        return minHeap.peek();
    }


}
