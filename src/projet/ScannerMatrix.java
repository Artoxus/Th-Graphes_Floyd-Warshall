package projet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMatrix {

	public ScannerMatrix() {
		
	}
	
	 public FloydWarshall readMatrixFile(String path) {
         Scanner sc2 = null;
         try {
             sc2 = new Scanner(new File(path));
         } catch (FileNotFoundException e) {
             System.out.println("the file can't be read"); 
         }
         int l1 = Integer.parseInt(sc2.nextLine());
         int[][] graph = new int[l1][l1];
         int i=0, j=0;
         while (sc2.hasNextLine()) {
             Scanner s2 = new Scanner(sc2.nextLine());
             while (s2.hasNext()) {
            	 String line=s2.next();
                 int s = Integer.parseInt(line);
                 try {
                     graph[i][j]=s;
                 }
                 catch (Exception e) {
                 }
                 j++;
             }
             i++; j=0;
             s2.close();
         }
         return new FloydWarshall(graph,l1);
	 }
}
