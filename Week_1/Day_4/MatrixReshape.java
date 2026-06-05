package Week_1.Day_4;

/*

Problem: Matrix Reshape

Approach: 
1.Check if total elements match.
2.If not possible,return original matrix.
3.Traverse original matrix in row-major order.
4.Fill new matrix using index mapping.

Formula:
newRow=index/c;
newCol=index%c;

Time Complexity: O(m*n)
Space Complexity:O(r*c)

*/

public class MatrixReshape {
    
     public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m=mat.length;
        int n=mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        int[][] reshaped=new int[r][c];

        int index=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                reshaped[index/c][index%c]=mat[i][j];
                index++;
            }
        }
        return reshaped;
    }

}
