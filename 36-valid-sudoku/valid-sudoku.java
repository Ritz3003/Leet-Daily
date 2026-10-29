class Solution {
    public boolean isValidSudoku(char[][] board) {

        //Optimal

        HashSet<String> set = new HashSet<>();

            for(int i = 0;i<9;i++){
                for(int j = 0;j<9;j++){
                    if(board[i][j] == '.') continue;

                    String r = "I have " + board[i][j] + "at row = " + i ;
                    String c = "I have " + board[i][j] + "at col = " + j ;
                    String box = "I have " + board[i][j] + " at box number = " + i/3 + " , " + j/3;

                    if(set.contains(r) || set.contains(c) || set.contains(box)){
                        return false;
                    }

                    set.add(r);
                    set.add(c);
                    set.add(box);
                }
            }
        
        return true;
    }
}