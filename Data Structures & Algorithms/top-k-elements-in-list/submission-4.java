class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // tìm số có tần suất xuất hiện nhiều nhất
        // tạo một hashMap
        HashMap<Integer, Integer> count = new HashMap<>();

        //Duyet qua mang nums
        for(int num: nums){
            //lấy values hiện tại vào sau đó + thêm 1
            count.put(num, count.getOrDefault(num, 0 ) + 1);
        }

        //tạo minHeap
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>((a,b) -> count.get(a) - count.get(b) );

        //Duyệt các số trong HashMap
        for(int num : count.keySet() ){
            //đưa số hiện tại vào Heap
            minHeap.offer(num);

            //nếu xuất hiện nhiều hơn k phần tử
            // thì xóa phần tử có frequence nhỏ nhất

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        // tạo mảng kết quả
        int[] result = new int[k];

        //laasy các phần tử còn lại trong Heap ra
        for(int i= k-1; i >=0 ; i--){
            result[i] = minHeap.poll();
        }
        return result;
    }
}
