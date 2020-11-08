package projet;

public class FloydWarshall {

	final static int INF = 9999; 
	private int[][] matrix;
	private int size;
	
	public FloydWarshall(int graph[][], int size) {
		this.size=size;
		this.matrix = graph;	
	}

	public void execute() { 
		int i, j, k; 
		for (i = 0; i < this.size; i++) 
			for (j = 0; j < this.size; j++) 
				matrix[i][j] = this.matrix[i][j]; 
		for (k = 0; k < this.size; k++) { 
			for (i = 0; i < this.size; i++) { 
				for (j = 0; j < this.size; j++) { 
					if (matrix[i][k] + matrix[k][j] < matrix[i][j]) 
						matrix[i][j] = matrix[i][k] + matrix[k][j];} 
				} 
			}
		}
	
	public void printMatrix() {
		for (int i = 0; i < this.size; ++i) {
			for (int j = 0; j < this.size; ++j) {
				if (matrix[i][j] == INF)
					System.out.print("INF ");
				else
					System.out.print(matrix[i][j] + "\t");
				}
			System.out.println();
			}
		}

}
