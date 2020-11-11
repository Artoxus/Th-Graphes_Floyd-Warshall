package projet;

public class FloydWarshall {

	final static int INF = 9999; 
	private int[][] matrix;
	private String[][] matrice;
	private int size;
	
	public FloydWarshall(int graph[][], int size) {
		this.size=size;
		this.matrix = graph;	
	}

	public void execute() {
		String[][] chemin= this.matriceChemin();
		for (int k = 0; k < this.size; k++) { 
			for (int i = 0; i < this.size; i++) { 
				for (int j = 0; j < this.size; j++) { 
					if (matrix[i][k] + matrix[k][j] < matrix[i][j] && matrix[i][k] != INF && matrix[k][j] != INF) { 
						matrix[i][j] = matrix[i][k] + matrix[k][j];
						chemin[i][j] = chemin[i][k] + chemin[k][j];
						}
					} 
				} 
			}
		for (int i = 0; i < this.size; i++)
			for (int j = 0; j < this.size; j++)
				if (chemin[i][j] != "None")
					chemin[i][j]= chemin[i][j] + j;
		this.matrice=chemin;
		}
	
	public void printMatrix() {
		System.out.print("\t");
		for (int i = 0; i<this.size; i++)
			System.out.print("("+i+")" + "\t");
		System.out.println("");
		for (int i = 0; i < this.size; i++) {
			System.out.print("("+i+")" + "\t");
			for (int j = 0; j < this.size; j++) {
				if (matrix[i][j] == INF)
					System.out.print("INF " + "\t");
				else
					System.out.print(matrix[i][j] + "\t");
				}
			System.out.println();
			}
		}
	
	public void printMatrice() {
		System.out.print("\t");
		for (int i = 0; i<this.size; i++)
			System.out.print("("+i+")" + "\t");
		System.out.println("");
		for (int i = 0; i < this.size; i++) {
			System.out.print("("+i+")" + "\t");
			for (int j = 0; j < this.size; j++) {
				if (matrice[i][j] == "None")
					System.out.print("None " + "\t");
				else
					System.out.print(matrice[i][j] + "\t");
				}
			System.out.println();
			}
		}
	
	public String[][] matriceChemin(){
		String[][] graph= new String[this.size][this.size];
		int[][] matrice=this.matrix;
		for (int i=0;i<this.size;i++) {
			for (int j=0;j<this.size;j++) {
					if (matrice[i][j]==INF)
						graph[i][j]="None";
					else
						graph[i][j]=i+"" ;
					}
			}
		return graph;
	}

	public boolean cheminAbsorbant() {
		boolean b = false;
		for (int i = 0; i<this.size; i++)
				if (this.matrix[i][i]<0)
					b=true;
		return b;
	}
}
