package projet;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter the matrix's file location : ");
		    String path = scanner.nextLine();
		    try {
		    	ScannerMatrix s = new ScannerMatrix();
		    	FloydWarshall a = s.readMatrixFile(path);
		        a.printMatrix();
		        System.out.println("");
		        System.out.println("Floyd Warshall :");
		        System.out.println("");
		        a.execute();
		        a.printMatrix();
		        }
		    catch (Exception e) {
		    	System.out.println("Error while executing program");
		        System.out.println(e.getMessage());
		        }
		    System.out.println("Load another matrix ? (yes or no)");
		    String answer = scanner.nextLine();
		    if (!answer.toLowerCase().equals("yes")) {
		    	scanner.close();
		    	return;
		    	}
		    }
		}
}
