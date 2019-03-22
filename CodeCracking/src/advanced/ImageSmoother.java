package advanced;

class ImageSmoother {
	public static void main(String[] args) {
		// Test 2D array
		int[][] image = {{0,3,4,5,1}, {8,6,5,3,2}, {0,3,4,5,1,}, {8,6,5,3,2}, {9,1,2,3,0}};
		int [][] smooth = imageSmoother(image);
		
		for (int[] i : smooth) {
			for (int j : i)
				System.out.print(j);
			System.out.println();
;		}
	}
	
	
    public static int[][] imageSmoother(int[][] M) {
        
        int row = M.length;
        int col = M[0].length;
        
        
        int[][] res = new int[row][col];
       
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                res[i][j] = smooth(M, i, j);
            }
        }
        
        return res;  
    }
    
    public static int smooth(int[][] M, int i, int j) {
        float sum = 0;
        float count = 0;
        
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if ((i == 0 && x == -1) || (i == M.length-1 && x == 1) 
                   || (j == 0 && y == -1) || (j == M[0].length-1 && y == 1))
                    continue;
                count++;
                sum += M[i + x][j + y];
            }
        }
        
        return (int) Math.floor(sum / count);
    }   
}