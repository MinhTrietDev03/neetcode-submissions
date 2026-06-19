class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // create three HashSet for rows, cols , boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        //Create HashSet for each element
        for(int i = 0 ; i< 9 ; i++){
            rows[i] =  new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Straverse the entries Sudoku board
        for(int row = 0; row < 9 ; row ++){

            for(int col = 0 ; col < 9 ; col ++){

                // Get the value of the current cell
                char num = board[row][col];

                //Skip if the cell empty
                if(num == '.'){
                    continue;
                }

                // Calculate the index of the 3x3 sub-box
                int box = (row/3)* 3 + (col/3);

                //if the number already  exits in the row
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
