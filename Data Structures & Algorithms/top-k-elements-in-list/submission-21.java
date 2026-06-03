class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> count= new HashMap<>();

        //Loop and arrange
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) +1);
        }

        //Create minHeap and arrange frequency
        PriorityQueue<Integer> minHeap =  
        new PriorityQueue<>((a,b) -> count.get(a) - count.get(b) );

        //loop 
        for(int num: count.keySet()){
            minHeap.offer(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        //create result[]
        int[] result = new int[k];

        //loop 
        for(int i = k -1 ; i>= 0 ; i--){
            result[i]=minHeap.poll();
        }
        return result;
    }
}
