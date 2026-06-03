class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //create HashMap
        HashMap<Integer, Integer> count = new HashMap<>();

        //loop and arrange 
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) +1);
        }

        // create minHeap and arage desending order
        PriorityQueue<Integer> minHeap =  
        new PriorityQueue<>((a, b) -> count.get(a) -count.get(b) );

        //loop and keySet
        for(int num : count.keySet()){
            minHeap.offer(num);

            if(minHeap.size()> k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];

        for(int i= k -1 ; i>=0 ; i--){
            result[i] = minHeap.poll();
        }
        return result;

    }
}
