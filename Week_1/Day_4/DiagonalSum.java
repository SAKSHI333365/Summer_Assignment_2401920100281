package Week_1.Day_4;

/*

Problem: Matrix Diagonal Sum

Approach:
Traverse the matrix once.
Add primary diagonal element mat[i][i]
Add secondary diagonal element mat[i][n-1-i]

If both diagonal overlap at center (odd size matrix),
count it only once.

Time Complexity: O(n)
Space Complexity: O(1) 

*/

public class DiagonalSum {
    
     public int diagonalSum(int[][] mat) {
        
        int n=mat.length;
        int sum=0;

        for(int i=0;i<n;i++){

            sum+=mat[i][i];
            sum+=mat[i][n-1-i];
        }

        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }

}
