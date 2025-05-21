class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> l=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0) 
                    l.add(new int[]{i,j});
            }
        }
        for(int[] x:l)
        {
            for(int j=0;j<m;j++)
                matrix[x[0]][j]=0;
            for(int i=0;i<n;i++)
                matrix[i][x[1]]=0;
        }
    }
}