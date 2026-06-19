class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Create HashSet to save value row , col , box
        Set<Character>[] rows =  new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        //KHỏi tạo hashste cho từng phần tử
        for(int i =0 ; i< 9 ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        //Strave the entries Sudoku board
        for(int row = 0 ; row < 9 ;row ++){
            for(int col =0 ; col < 9 ; col ++){

                // get the value of the current
                char num = board[row][col];

                //Skip if the cell is empty
                if(num == '.'){
                    continue;
                }

                //calculate sub-board 3z3
                int box = (row /3) *3  + (col /3);

                //if num contains row return false
                if(rows[row].contains(num)){
                    return false;
                }
                if(cols[col].contains(num)){
                    return false;
                }
                if(boxes[box].contains(num)){
                    return false;
                }

                //Otherwise, add the number to the set 
                rows[row].add(num);
                cols[col].add(num);
                boxes[box].add(num);
            }
        }
        return true;
    }
}
