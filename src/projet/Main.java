package projet;

public class Main {
		
	public static void main(String[] args) {
		String path = "C:\\Users\\badma\\OneDrive\\Bureau\\123.txt";
		
		ScannerMatrix s = new ScannerMatrix();
		FloydWarshall a = s.readMatrixFile(path);
		a.printMatrix();
		System.out.println("");
		System.out.println("Floyd Warshall :");
		System.out.println("");
		a.execute();
		a.printMatrix();
		}

}
