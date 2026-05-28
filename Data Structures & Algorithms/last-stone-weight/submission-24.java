/*
b1: tạo một maxHeap
b2: lặp cho stons và đưa các phần tửu vào maxHeap
b3: lặp cho tới khi nào còn ít nhất 2 stone
-tạo stone1
-tạo stone2
- nếu stone1 khác stone2 thì sẽ tạo ra newstone
-đưa newstone vào maxHeap
b4: kiêm tra maxHeap có isEmpty không
b5: nếu còn một stone thì return stone đó

*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        // create maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if (stone1 != stone2) {
                int newstone = stone1 - stone2;
                maxHeap.offer(newstone);
            }
        }
        if (maxHeap.isEmpty()) {
            return 0;
        }
        return maxHeap.peek();
    }
}
