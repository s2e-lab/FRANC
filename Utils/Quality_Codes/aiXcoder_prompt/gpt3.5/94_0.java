import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			Random rnd = new Random();
return array[rnd.nextInt(array.length)];
}

public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine().trim());
	for (int i = 0; i < t; i++) {
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0].trim());
		int m = Integer.parseInt(s[1].trim());
		int[] u = new int[m];
		int[] v = new int[m];
		for (int j = 0; j < m; j++) {
			String[] s1 = br.readLine().split(" ");
			u[j] = Integer.parseInt(s1[0].trim());
			v[j] = Integer.parseInt(s1[1].trim());
		}
		int[] array = new int[n];
		for (int j = 1; j <= n; j++) {
			array[j - 1] = j;
		}
		List<Integer> removed = new ArrayList<Integer>();
		int count = 0;
		while (count < n - 2) {
			int rand = random(array);
			if (!removed.contains(rand)) {
				removed.add(rand);
				count++;
			}
		}
		boolean[] deleted = new boolean[n];
		for (int j = 0; j < n - 2; j++) {
			deleted[removed.get(j) - 1] = true;
		}
		int[] degrees = new int[n];
		for (int j = 0; j < m; j++) {
			if (!deleted[u[j] - 1] && !deleted[v[j] - 1]) {
				degrees[u[j] - 1]++;
				degrees[v[j] - 1]++;
			}
		}
		int leaf1 = -1;
		int leaf2 = -1;
		for (int j = 0; j < n; j++) {
			if (degrees[j] == 1) {
				if (leaf1 == -1) {
					leaf1 = j + 1;
				} else {
					leaf2 = j + 1;
					break;
				}
			}
		}
		System.out.println(leaf1 + " " + leaf2);
	}
}
}