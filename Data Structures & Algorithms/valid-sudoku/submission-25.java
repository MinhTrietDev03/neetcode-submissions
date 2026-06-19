class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Create 3 HashSet[9] 
        Set<Character>[] rows  = new HashSet[9];
        Set<Character>[] cols  = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        //Create HashSet for each element
        for(int i=0; i< 9 ; i++){
            rows[i] = new HashSet<>();
            cols[i]=  new  HashSet<>();
            boxes[i] = new HashSet<>();

        }

        //Strave toàn bộ aborad 
        for(int row = 0 ; row < 9 ; row ++){

            for(int col = 0; col < 9 ; col ++){

                char num = board[row][col];

                if(num == '.'){
                    continue;
                }

                int box = (row / 3) * 3 + (col /3);

                //Check rows, cols, boxes contains return false
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
