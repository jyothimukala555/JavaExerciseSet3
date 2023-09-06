package com.javaExSet3;

public class IsVowelOrNotUsingSwitch {

	private char ch;
	public IsVowelOrNotUsingSwitch(char ch) {
		this.ch = ch;
	}
	
	public static void main(String [] args) {
		IsVowelOrNotUsingSwitch vowel = new IsVowelOrNotUsingSwitch('E');
		System.out.println(vowel.isVowel());
	}

	    // Method to determine if a character is a vowel
	    public boolean isVowel() {
	    
	        // Use a switch statement to check for each vowel, both lowercase and uppercase
	        switch (ch) {
	        case 'A': return true;
	        case 'E': return true;
	        case 'I': return true;
	        case 'O': return true;
	        case 'U': return true;
	        case 'a': return true;
	        case 'e': return true;
	        case 'i': return true;
	        case 'o': return true;
	        case 'u': return true;
	            // TODO: Complete the switch statement
	        //case 'A', 'E', 'I', 'O','U': return true;
	        //case 'a', 'e', 'i', 'o','u': return true;
	        //default : false;
	      
	        }

	        return false;
	    }
	}

