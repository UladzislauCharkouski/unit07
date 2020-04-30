package by.epam.tr.start;

import java.util.Random;
import java.util.Scanner;

public class TaskForTest {
	public static void main(String[] arg) {
		int n = size();
		int m = size();
		int matrix[][] = new int[n][m];
		initializationAndPrintArray(matrix);
		calculateSumNegativesNumbersAndPrintResult(matrix);
		maxNumberInLine(matrix); 
		int max = maxNumberInArray(matrix);
		int min = minNumberInArray(matrix);
		replaceMaxAndMin(matrix, max, min);
	}

	public static int size() {
		System.out.println("enter array size");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		return size;
	}

	public static void initializationAndPrintArray(int matrix[][]) {
		Random rand = new Random();
		System.out.println("array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) rand.nextInt(41) - 20;
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void calculateSumNegativesNumbersAndPrintResult(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			int x = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					x = x + matrix[i][j];
				}
			}
			if (x > 0 || x < 0) {
				System.out.println("sum of negatives numbers in the " + (i+1) + " line = " + x);
			} else {
				System.out.println("there are no negative numbers in this line");
			}
		}
		System.out.println();
	}

	public static void maxNumberInLine(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			int max = matrix[0][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
			System.out.println("max number in the " + (i+1) + " line = " + max);
		}
		System.out.println();
	}

	public static int maxNumberInArray(int matrix[][]) {
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
		}
		System.out.println("max number in array = " + max);
		return max;
	}

	public static int minNumberInArray(int matrix[][]) {
		int min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		System.out.println("min number in array = " + min);
		System.out.println();
		return min;
	}
	
	public static void replaceMaxAndMin(int matrix[][], int max, int min) {

		System.out.println("original array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
		int imax = 0;
		int jmax = 0;
		int imin = 0;
		int jmin = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
	    		 if(matrix[i][j] == max) {
	    			 imax=i;
	    			 jmax=j;
	    		 }else if(matrix[i][j] == min) {
	    			 imin=i;
	    			 jmin=j;
	    		 }
	    	 }
	     }
		 matrix[imax][jmax]=min;
	     matrix[imin][jmin]=max;
	     
		System.out.println("array after replace max and min:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
