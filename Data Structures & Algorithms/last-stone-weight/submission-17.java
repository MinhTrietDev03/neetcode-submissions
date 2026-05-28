class Solution {

    //create lastStoneWeight
    public int lastStoneWeight(int[] stones){

        //Create maxheap do là 
        PriorityQueue <Integer> maxHeap =  new PriorityQueue<>((a,b) -> b -a);

        //duyệt toàn bộ stones
        for(int stone : stones){
            //ddauw toàn bộ vòa maxHeap
            maxHeap.offer(stone);
            
        }

        //lặp cho tới khi có ít nhất 2 stone
        while(maxHeap.size() > 1){

            // create stone1 và stone2
            int stone1 = maxHeap.poll();

            int stone2 = maxHeap.poll();

            //nếu 2 stone khác nhau thi sẽ tạo ra newstone

            if(stone1 != stone2){
                int newstone = stone1 - stone2;

                //đưa stone mới vào maxheap
                maxHeap.offer(newstone);
            }

            if(maxHeap.isEmpty()){
                return 0;
            }
           
        }
         return maxHeap.peek();
    }


}
