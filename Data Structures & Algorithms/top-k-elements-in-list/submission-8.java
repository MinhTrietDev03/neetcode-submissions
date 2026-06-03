class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //create hashmap
        HashMap<Integer,Integer> count = new HashMap<>();

        //duyet qua các phân tu nums
        for(int num : nums){

            //Nếu num đã tồn tại trong HashMap thì lấy giá trị hiện tại
            //Nếu chưa thì return về 0
            count.put(num, count.getOrDefault(num,0) +1);
        }

        // craete MinHeap and sắp xếp theo số lần xuát hiện
        PriorityQueue<Integer> minHeap =
        new PriorityQueue<>((a,b) -> count.get(a)- count.get(b) );

        //Đưa các số vào Heap
        for(int num : count.keySet()){
            minHeap.offer(num);

            // nếu phần tử vượt quá k thì poll();
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        //tạo tạo một mảng kết quả
        int[] result = new int[k];

        //lấy các phần tử còn lại bên trong Heap
        for(int i = k- 1; i>=0; i--){
            result[i] = minHeap.poll();
        }
        return result;


    }
}
