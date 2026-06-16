class Solution {

    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> boxes = new HashMap<>();

        for (int r = 0; r < 9; r++) {

            for (int c = 0; c < 9; c++) {

                char num = board[r][c];

                if (num == '.') {
                    continue;
                }

                String boxKey = (r / 3) + "," + (c / 3);

                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());
                boxes.putIfAbsent(boxKey, new HashSet<>());

                if (rows.get(r).contains(num) ||
                    cols.get(c).contains(num) ||
                    boxes.get(boxKey).contains(num)) {

                    return false;
                }

                rows.get(r).add(num);
                cols.get(c).add(num);
                boxes.get(boxKey).add(num);
            }
        }

        return true;
    }
}