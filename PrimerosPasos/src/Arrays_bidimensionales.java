
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {
				{10,15,18,19,21},
				{10,57,17,19,7},
				{19,2,19,17,7},
				{92,13,13,32,41}
		};
		
		for(int[]fila:matrix) {
			for(int z: fila) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
		/*for (int i=0; i<4; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(matrix[i][j]);
				
				if(matrix[i][j]<10)
					System.out.print("  ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
	} 

}
