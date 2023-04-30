if(array != null && array.length > 0){
			return true;
	}
	return false;
}

/**
* Calculate the sum of the given array.
* Returns 0 if the array is null or empty.
*/
public int calculateSum(int[] array){
	if(checkNotNullOrEmpty(array)){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		return sum;
	}
	return 0;
}

/**
* Find the maximum value in the given array.
* Returns Integer.MIN_VALUE if the array is null or empty.
*/
public int findMaximum(int[] array){
	if(checkNotNullOrEmpty(array)){
		int max = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	return Integer.MIN_VALUE;
}

/**
* Find the minimum value in the given array.
* Returns Integer.MAX_VALUE if the array is null or empty.
*/
public int findMinimum(int[] array){
	if(checkNotNullOrEmpty(array)){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
	return Integer.MAX_VALUE;
}

public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().trim().split("\\s+");

	int[] array = new int[str.length];

	for(int i=0; i<str.length; i++){
		array[i] = Integer.parseInt(str[i]);
	}

	ID107 obj = new ID107();
	System.out.println("Sum of the given array: "+obj.calculateSum(array));
	System.out.println("Maximum element in the given array: "+obj.findMaximum(array));
	System.out.println("Minimum element in the given array: "+obj.findMinimum(array));
	}
}