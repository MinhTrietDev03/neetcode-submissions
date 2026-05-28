class Solution {
    //contructer lastStoneWeight
    public int lastStoneWeight(int[] stones){

        //tạo maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a );

        //duuyeet các phầ tư stones
        for(int stone : stones){
            //thêm vào maxHeap()
            maxHeap.offer(stone);
        }

        //lặp cho đến khi nào còn ít nhất 2 viên đá
        while(maxHeap.size() > 1){
            
            //tạo stone1 và stone 2
            int stone1 = maxHeap.poll();

            int stone2 = maxHeap.poll();

            if(stone1 != stone2){
                int newstone = stone1 - stone2;

                maxHeap.offer(newstone);
            }

            if(maxHeap.isEmpty()){
                return 0;
            }
        }
        return maxHeap.peek();
    }
}
