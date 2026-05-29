class Solution {
    public int lastStoneWeight(int[] stones) {
        
        //creaete maxHeap
        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>((a,b) -> b-a);

        //lặp các phần tử tỏng stones và đưa vào maxHeap
        for(int stone: stones){
            maxHeap.offer(stone);
        }

        //Lặp cho den khi nao con ít nhat 2 vien
        while(maxHeap.size()>1){
            
            //tạo mọt stone1 vá stone 2
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            //kiểm tra neeys nếu 2 viên khac nhau
            if(stone1 != stone2){
                maxHeap.offer(stone1 -stone2);
            }
        }

        // nếu maxHeap rỗng 
        if(maxHeap.isEmpty()){
            return 0;
        }

        return maxHeap.poll();

    }
}
