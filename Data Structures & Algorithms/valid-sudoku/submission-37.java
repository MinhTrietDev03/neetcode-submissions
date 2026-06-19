class Solution {
    public boolean isValidSudoku(char[][] board) {
        //tạo 9 hashset để lưu các số xuất hiện trên cùng một hàng , côt  và sub box 3x3
        Set<Character>[] rows =  new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes =  new HashSet[9];

        //KHỏi tại HashSet cho từng phần tử 
        for(int i =0 ; i <9 ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // duyệt qua toàn bộ board
        for(int row= 0 ; row <9 ; row++){
            for(int col=0; col < 9 ; col++){

                char num = board[row][col];

                if(num == '.'){
                    continue;
                } 

                int box = (row/3)*3 + (col/3);

                if(rows[row].contains(num)){
                    return false;
                }
                if(cols[col].contains(num)){
                    return false;
                }
                if(boxes[box].contains(num)){
                    return false;
                }

                rows[row].add(num);
                cols[col].add(num);
                boxes[box].add(num);
            }
        }
        return true;
    }
}
