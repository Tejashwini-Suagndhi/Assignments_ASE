package com.java;

public class Pangram {
	
	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        boolean result = isPangram(input);
	        
	        if (result) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        
	        boolean[] alphabetPresent = new boolean[26];
	        int Count = 0;

	        for (char ch : input.toLowerCase().toCharArray()) {
	            if (ch >= 'a' && ch <= 'z') {
	                int index = ch - 'a';
	                if (!alphabetPresent[index]) {
	                    alphabetPresent[index] = true;
	                    Count++;
	                }
	                if (Count == 26) {
	                    return true;
	                }
	            }
	        }

	       
	        return false;
	    }
	}


