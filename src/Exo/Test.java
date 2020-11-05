package Exo;

import java.util.Scanner;


public class Test {
	final static float INF = Float.POSITIVE_INFINITY;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.out.println("Hi");
		int abc = 3;
		System.out.println((abc +1) +"");
		int[] tab = {0,1};
		System.out.println(tab[-1]);
		/*Object[] tabs = init(args);
		Object[] res = floydWarshall(tabs);
		
		System.out.println(res[0]);
		System.out.println(res[1]);*/
		

	}
	
	public static Object[] init(int[] args){
		Scanner dep = new Scanner(System.in);
		
		int i = dep.nextInt();
		float[][] m = new float[i][i];
		String[][] chemin = new String[i][i];
		
		for(int j = 0; j < i; j++) {
			for(int n = 0; n < i; n++) {
				m[j][n] = INF;
				chemin[j][n] = "Aucun chemin";
			}
			m[j][j] = 0;
			chemin[j][j] = (j+1) +"";
		}
		
		for(int k = 1; k < (args.length +2)/3 ; k++) {
			int d = dep.nextInt();
			int a = dep.nextInt();
			int l = dep.nextInt();
			m[d][a] = l;
			chemin[d][a] = d + "," + a;
			
		}
		dep.close();
		Object[] res = {m , chemin};
		return res;
	}
	
	
	public static Object[] floydWarshall(Object[] arg) {
		float[][] m = (float[][])arg[0];
		String[][] chemin = (String[][])arg[1];
		
		int a = m.length;
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				for(int k = 0; k < a; k++) {
					if(m[j][i] + m[i][k] < m[j][k]) {
						m[j][k] = m[j][i] + m[i][k];
						chemin[j][k] = chemin[j][i] + ',' + chemin[i][k];
					}
				}
			}
		}
		Object[] res = {m , chemin};
		return res;
		
	}

}
