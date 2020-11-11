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
         for (int k=0;k<l1;k++)
        	 for (int l=0;l<l1;l++)
        		 graph[k][l]=9999;
         while (sc2.hasNextLine()) {
             Scanner s2 = new Scanner(sc2.nextLine());
             while (s2.hasNext()) {
            	 String line=s2.next();
                 int i = Integer.parseInt(line);
                 String line2=s2.next();
                 int j = Integer.parseInt(line2);
                 String line3=s2.next();
                 int s = Integer.parseInt(line3);
                 try {
                     graph[i][j]=s;
                 }
                 catch (Exception e) {
                 }
             }
             s2.close();
         }
         return new FloydWarshall(graph,l1);
	 }
}
