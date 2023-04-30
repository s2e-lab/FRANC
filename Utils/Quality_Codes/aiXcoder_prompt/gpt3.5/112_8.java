import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double sum = 0.0;
		for(int i=0; i<p0.length;i++){
			sum+= Math.pow((p0[i]-p1[i]), 2);
		}
		return Math.sqrt(sum);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		int count = 0;
		while((s=br.readLine())!=null){
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			double[] p0 = new double[n];
			for(int i=0;i<n;i++){
				p0[i]=Double.parseDouble(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			double[] p1 = new double[m];
			for(int i=0;i<m;i++){
				p1[i]=Double.parseDouble(st.nextToken());
			}
			System.out.printf("Teste %d\n", ++count);
			System.out.printf("%.2f\n",length(p0, p1));
			System.out.println();
		}
	}
}
 
/**
* Sample Input:
* 3 1 2 3
* 3 4 5 6
* 2 3 3 2
* 2 1 1
*
* Sample Output:
* Teste 1
* 4.24
* 
* Teste 2
* 1.73
*/