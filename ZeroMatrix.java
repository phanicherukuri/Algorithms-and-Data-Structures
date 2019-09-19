package crackingthecodinginterview;

import java.util.*;

/*
 *  Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. 
 */

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				arr[i][j] = i+j;
			}
		}
		
		arr = setZeros(arr);
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	private static int[][] setZeros(int[][] arr){
		Set<Integer> row = new HashSet<>();
		Set<Integer> column = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == 0) {
					row.add(i);
					column.add(j);
				}
			}
		}
		
		for(int i: row) {
			for(int j=0; j<arr[0].length;j++) {
				arr[i][j] = 0;
			}
		}
		
		for(int j: column) {
			for(int i=0; i<arr.length;i++) {
				arr[i][j] = 0;
			}
		}
		
		
		
		return arr;
	}
}
