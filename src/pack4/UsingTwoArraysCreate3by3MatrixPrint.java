package pack4;

public class UsingTwoArraysCreate3by3MatrixPrint {//declare 3*3 array:
	public static void main(String[] args) {
		
	
	int[][] numberGrid = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			
	};
		
		for(int i = 0; i< numberGrid.length; i++){
			
		for (int j=0; j<= numberGrid[i].length; j++) {
			
			System.out.print(numberGrid[i][j]);
		}
		
		//System.out.println();
	}
	
	


}

}



