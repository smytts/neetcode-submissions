class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>(); // Key = ((row/3) * 3 + column/3)

            for (int row = 0; row < 9; row++) { // check each row
                for (int col = 0; col < 9; col++) { // check each column
                    char cell = board[row][col]; // collect what char value is stored in the current cell (row and column)
                    if (cell == '.') continue;
                    // look for duplicates in rows, columns, and 3x3 squares; return false if duplicate found
                    if (
                            rows.getOrDefault(row, new HashSet<>()).contains(cell)
                            || columns.getOrDefault(col, new HashSet<>()).contains(cell)
                            || squares.getOrDefault((row / 3) * 3 + (col / 3), new HashSet<>()).contains(cell)
                    ) {
                        return false;
                    }
                    // add cell to row, column, and square Hashmap if it is not present for comparison later
                    columns.computeIfAbsent(col, k -> new HashSet<>()).add(cell);
                    rows.computeIfAbsent(row, k -> new HashSet<>()).add(cell);
                    squares.computeIfAbsent((row / 3) * 3 + (col / 3), k -> new HashSet<>()).add(cell);
                }
            }
            return true;
    }
}
