class Solution {
    
    public int lastStoneWeight(int[] stones){

        // tạo Max Heap
        // phần tử lớn nhất sẽ nằm trên đầu heap
        PriorityQueue<Integer> maxHeap= 
        new PriorityQueue<>((a,b) -> b-a );

        //duyệt qua toàn bộ stone và đưa vòa Heap
        for(int stone : stones){
            maxHeap.offer(stone);
        }

        //Lặp cho đến khi còn 2 viên đá
        while(maxHeap.size() > 1){

            // lấy viên đá lớn nhất
            int stone1 = maxHeap.poll();

            //lấy viên đá lớn thứ 2
            int stone2 = maxHeap.poll();

            //nếu 2 viên khác nhau
            if(stone1 != stone2){
                
                //tạo viên đá mới
                int newstone = stone1 -stone2;

                //đưa viên đá mới vào heap
                maxHeap.offer(newstone);
            }
        }

        //Nếu heap null rỗng thì không có viên nào
        if(maxHeap.isEmpty()){
            return 0;
        }

        //return viên đá cuối cùng
        return maxHeap.peek();

    }

}
