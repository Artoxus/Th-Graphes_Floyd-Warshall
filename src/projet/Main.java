package projet;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter the graph's file location : ");
		    String path = scanner.nextLine();
		    try {
		    	ScannerMatrix s = new ScannerMatrix();
		    	FloydWarshall a = s.readMatrixFile(path);
		    	System.out.println("");
		        System.out.println("Matrice d'adjacence :");
		        System.out.println("");
		        a.printMatrix();
		        System.out.println("");
		        System.out.println("Floyd Warshall :");
		        System.out.println("");
		        a.execute();
		        a.printMatrix();
		        System.out.println("");
		        if (a.cheminAbsorbant())
		        	System.out.println("Il y a un chemin absorbant");
		        else {
		        	System.out.println("Il n'y a pas de chemin absorbant donc,");
		        	System.out.println("Matrice des chemins :");
		        	System.out.println("");
		        	a.printMatrice();}
		        System.out.println("");
		        }
		    catch (Exception e) {
		    	System.out.println("Error while executing program");
		        System.out.println(e.getMessage());
		        }
		    System.out.println("Load another graph ? (yes or no)");
		    String answer = scanner.nextLine();
		    if (!answer.toLowerCase().equals("yes")) {
		    	scanner.close();
		    	return;
		    	}
		    }
		}
}
