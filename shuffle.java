package com.java;

import java.util.Random;

public class shuffle {
	
	 public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random random = new Random();
	        for (int i = n - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1);
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	 }
	 public static void main(String[] args) {
	        int[]arr = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(arr);

	        for (int number : arr) {
	            System.out.print(number + " ");
	        }
	    }
	}


