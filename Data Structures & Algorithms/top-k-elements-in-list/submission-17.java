class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> count  = new HashMap<>();

        //for and arrange
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) +1);

        } 

        //tạp một minHeap
        PriorityQueue<Integer> minHeap = 
        new PriorityQueue<>((a, b) -> count.get(a) - count.get(b) );

        //loop and keySet
        for(int num : count.keySet() ){
            minHeap.offer(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        // create arr result[]
        int[] result = new int[k];

        //Loop 
        for(int i= k-1 ; i>=0 ; i--){
            result[i] = minHeap.poll();
        }
        return result;
    }
}
