package org.raman.algorithim.general;

/**
 * Q:Given an integer in base 10, convert to a given base. 
 *
 * The below answer is from base 10 to base 2
 * Seed 0 is "0"
 * We issue a recursive call that concatenate
 * the current number modulo 2 with a recursive call
 * of the current number divide the number by 2
 */
public class Base10toBin {

	public String toBinRecursive(int number){
		return toBinRecursiveInternal(number,true);
	}

	private String toBinRecursiveInternal(int number, boolean firstCall) {
		if(firstCall){
			if(number == 0) return "0";	
		}else{
			if(number == 0) return "";
		}
		
		int num = number/2;
		return toBinRecursiveInternal(num,false)+(number%2);
	}
}
