package Arrays;

import java.util.Scanner;

public class mergedArrays {
	    public static void main(String[] args) {
	        // Sample input
	        int[] A = {1, 3, 5, 7, 9, 11, 13, 15}; // Ascending order
	        int[] B = {15, 11, 9, 7, 5, 3};       // Descending order

	        // Call the function to find repeated elements
	        findRepeatedElements(A, B);
	    }

	    public static void findRepeatedElements(int[] A, int[] B) {
	        // Reverse array B to make it ascending
	        int M = B.length;
	        int[] reversedB = new int[M];
	        for (int i = 0; i < M; i++) {
	            reversedB[i] = B[M - 1 - i];
	        }

	        // Two pointers for both arrays
	        int i = 0, j = 0;

	        // Print common elements
	        while (i < A.length && j < reversedB.length) {
	            if (A[i] == reversedB[j]) {
	                System.out.print(A[i] + " ");
	                i++;
	                j++;
	            } else if (A[i] < reversedB[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }
	    }
	}
	    
	


