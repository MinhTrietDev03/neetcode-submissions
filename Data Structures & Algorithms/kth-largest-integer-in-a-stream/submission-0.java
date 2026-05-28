class KthLargest {

    //create minHeap to save elemet largest
    private PriorityQueue<Integer> minHeap;

    //bien luu gia tri k
    private int k;

    //Constructer
    public KthLargest(int k, int[] nums){
        
        //gán k bằng biến global
        this.k = k;

        //tạo minHeap
        minHeap = new  PriorityQueue<>();

        //duyet toan bo manh nums ban dau
        for(int num : nums){

            //add element to Heap
            minHeap.offer(num);

            //Nếu heap vượt quá k phần tử
            if(minHeap.size() > k){

                //xóa ohaafn tử nhỏ nhát
                minHeap.poll();
            }
        } 

    }


    //hàm thêm số mới vào stream
    public int add(int val){

        //thêm vào heap
        minHeap.offer(val);

        // Nếu heap vượt qua k phần tửu
        if(minHeap.size() > k){

            //xóa phần tử nhỏ nhất
            minHeap.poll();
        }

        //phần tử đầu heap = kth largest
        return minHeap.peek();
    }
    
}
