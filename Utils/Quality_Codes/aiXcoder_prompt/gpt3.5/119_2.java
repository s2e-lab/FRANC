import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String.format("%.2f", val);
}

/**
* 判断有向无环图中是否存在环
*/
public static boolean hasCycle(int n, List<Integer>[] graph){
	int[] inDegree = new int[n];
	Queue<Integer> queue = new LinkedList<>();
	for(int i=0;i<n;i++){
		for(int j:graph[i]){
			inDegree[j]++;
		}
	}
	for(int i=0;i<n;i++){
		if(inDegree[i]==0){
			queue.offer(i);
		}
	}
	while(!queue.isEmpty()){
		int cur = queue.poll();
		for(int next:graph[cur]){
			inDegree[next]--;
			if(inDegree[next]==0){
				queue.offer(next);
			}
		}
	}
	for(int i=0;i<n;i++){
		if(inDegree[i]!=0){
			return true;
		}
	}
	return false;
}

/**
* 计算两点之间的欧几里得距离
*/
public static double euclideanDist(int x1, int y1, int x2, int y2){
	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
}

/**
* 主函数，读入数据并输出答案
*/
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextInt()){
		int n = sc.nextInt();
		List<Integer>[] graph = new List[n+1];
		for(int i=1;i<=n;i++){
			graph[i] = new ArrayList<>();
		}
		for(int i=1;i<=n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			for(int j=1;j<i;j++){
				if(euclideanDist(x,y,sc.nextInt(),sc.nextInt())<r){
					graph[i].add(j);
				}else{
					graph[j].add(i);
				}
			}
		}
		if(hasCycle(n+1, graph)){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
	sc.close();
}
}