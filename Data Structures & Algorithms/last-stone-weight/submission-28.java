class Solution {
    public int lastStoneWeight(int[] stones) {
        
        //create một maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        //lặp qua stone đưa toàn bộ vòa maxHeap
        for(int stone : stones){
            maxHeap.offer(stone);
        }

        //lăp cho đén khi con ít nhất 2 stoen
        while(maxHeap.size() >1){

            // lấy 2 viên lớn nhất
            int stone1 = maxHeap.poll();
            int stone2= maxHeap.poll();


            // nếu stone1 != stone2 không còn viên nào
            if(stone1 != stone2){
                maxHeap.offer(stone1 - stone2);
            }
        }


        //nếu không còn stone => return 0;
        if(maxHeap.isEmpty()){
            return 0;
        }

        return maxHeap.poll();

    }
}
