package com.canddella.utility;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scanner.nextLine();
		
 boolean isPalidrome = isPalidrome(word);
	
			if (isPalidrome)
			{
				System.out.println("The given word is palidrome");
				
			}
			else
			{
				System.out.println("The given word is not palidrome");
				
			}
	   }
	private static boolean isPalidrome(String word) {
		word = word.toLowerCase();
		int left = 0;
		int right = word.length()-1;
		while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true;
	}

}
