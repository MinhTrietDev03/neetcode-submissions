class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //create hashMap
        HashMap<Integer, Integer> count = new HashMap<>();

        //duyệt qua các phần tử và sắp xếp theo thứ tự xuất hiện
        for(int num : nums){
            
            //nếu vị trí hiện taij bằng 0  sẽ return về 0
            //nếu có num ở vị trí hiện tại thì sẽ +1 => số lần xuất hiện
            count.put(num, count.getOrDefault(num, 0) +1);
        }

        // create minHeap
        PriorityQueue<Integer> minHeap =
        new PriorityQueue<>((a,b) -> count.get(a) - count.get(b));

        // đưa các phần tử vào Min Heap
        for(int num : count.keySet()){
            minHeap.offer(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        //tạo một result[]

        int[] result = new int[k];

        for(int i= k-1 ; i>= 0 ;i--){
            result[i] = minHeap.poll();
        } 
        return result;
    }
}
