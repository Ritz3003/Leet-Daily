class Solution {

   boolean traverseBoxes(char[][] board, int sr, int er, int sc, int ec){
 Set<Character> set = new HashSet<>();
    for(int i = sr; i<=er;i++){
        
         for(int j = sc; j<=ec;j++){
            char c = board[i][j];

            if(set.contains(c)){
                return false;
            }
            else if(c!='.'){
                set.add(c);
            }
            
         }
         

        // set.clear();
    }

    return true;

   }
    public boolean isValidSudoku(char[][] board) {

        //Brute force 

       //for row 

       for(int i = 0;i<9;i++){
        Set<Character> set = new HashSet<>();
        for(int j = 0;j<9;j++){

            char c = board[i][j];

            if(set.contains(c)){
                return false;
            }
            else if(c!='.'){
                set.add(c);
            }

        }
        set.clear();
       
       } 

       // for columns
//st.clear();
       
       for(int i = 0;i<9;i++){
        Set<Character> set = new HashSet<>();
        for(int j = 0;j<9;j++){

            char c = board[j][i];

            if(set.contains(c)){
                return false;
            }
           else if(c!='.'){
                set.add(c);
            }

        }
        set.clear();
        
       } 

       //for box sr == starting row, er = ending row , sc = starting col, ec = ending col
     boolean isValidBox = true;
       for(int sr = 0;sr<9;sr+=3){
           int er = sr+2;

           for(int sc = 0; sc<9;sc+=3){
              int ec = sc + 2;

              // traverse and check box
             if(!traverseBoxes(board,sr,er,sc,ec)){
                return false;
             }
           }
       }

       return true;
        
    }
}