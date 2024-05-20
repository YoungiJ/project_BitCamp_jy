package chpter01;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		int[]num1= new int[]{10,30,69,16,8,31,22};
        System.out.println("자리 교환 전: " + Arrays.toString(num1));
        
        selectionSort(num1);
        
        System.out.println("정렬 후: " + Arrays.toString(num1));
    }
	 public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}