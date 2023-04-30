import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			StringTokenizer tokenizer = new StringTokenizer(sequence, delimiter);
List<String> values = new ArrayList<String>();
while(tokenizer.hasMoreTokens()){
   values.add(tokenizer.nextToken());
}
return values;
}

/**
* Find the sum of the diagonal values of the given square matrix.
*/
public static int sumOfDiagonalValues(int[][] matrix){
int sum = 0;
for(int i = 0; i < matrix.length; i++){
   sum += matrix[i][i]; // add the diagonal value
}
return sum;
}

/**
* Main function that generates the spiral matrix of the given size
* and returns the sum of its diagonal values.
*/
public static int generateSpiralMatrix(int size){
int[][] matrix = new int[size][size];
int value = 1;
int row = size/2, col = size/2; // start from the middle
int direction = 0; // 0 = right, 1 = down, 2 = left, 3 = up

while(value <= size*size){
   matrix[row][col] = value;
   value++;

   // change direction if necessary
   if(direction == 0 && (col == size-1 || matrix[row-1][col+1] != 0)){
       direction = 1;
   }else if(direction == 1 && (row == size-1 || matrix[row+1][col] != 0)){
       direction = 2;
   }else if(direction == 2 && (col == 0 || matrix[row][col-1] != 0)){
       direction = 3;
   }else if(direction == 3 && (row == 0 || matrix[row-1][col] != 0)){
       direction = 0;
   }

   // move to the next position based on direction
   if(direction == 0){
       col++;
   }else if(direction == 1){
       row++;
   }else if(direction == 2){
       col--;
   }else if(direction == 3){
       row--;
   }
}

// find and return the sum of the diagonal values
return sumOfDiagonalValues(matrix);
}

public static void main(String[] args){

Scanner in = new Scanner(System.in);
System.out.print("Enter the size of spiral matrix: ");
int size = in.nextInt();

int sum = generateSpiralMatrix(size);

System.out.println("The sum of diagonal values of spiral matrix of size "+size+" is "+sum);

}
}