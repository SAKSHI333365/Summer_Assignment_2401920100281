package Week_1.Day_4;

/*

Problem: Spiral Matrix

Approach:
Use boundary pointers:
top,bottom,left,right

Traverse in 4 directions:
1. Left to Right
2. Top to Bottom
3. Right to Left
4. Bottom to top

After each traversal, shrink boundaries.

Time Complexity: O(m*n)
Space Comlexity: O(1)

*/

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    
     public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result=new ArrayList<>();

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        while(top<=bottom && left<=right){

            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

}
