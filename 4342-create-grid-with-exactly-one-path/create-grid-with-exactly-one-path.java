class Solution {
    public String[] createGrid(int m, int n) {

           char[][] grid = new char[m][n];
        // Step: 0 make the complete grid filled with #
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = '#';

            }
        }
 

            // move to top row

            for(int j = 0;j<n;j++){
                grid[0][j] = '.';
            }

            // last colum move there 

            for(int i = 0;i<m;i++){
                grid[i][n-1] = '.';
            }
          
          String res[] = new String[m];

          for(int i = 0;i<m;i++){
            res[i] = new String(grid[i]);
          }


      return res;

        

        
    }
}