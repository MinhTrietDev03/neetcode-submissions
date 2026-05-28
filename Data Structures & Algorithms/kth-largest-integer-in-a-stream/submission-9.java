class KthLargest {

    private PriorityQueue<Integer> minHeap;

    private int k;

    private KthLargest(int k, int[] nums){

        this.k = k;

        minHeap = new PriorityQueue<>();
        for(int num: nums){

            minHeap.offer(num);
            if(minHeap.size() > k ){
                minHeap.poll();
            }
        }

    }
    public int add (int val){

        minHeap.offer(val);

        if(minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
    
    
} 
