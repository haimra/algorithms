package org.raman.algorithim.general;

/**
 * Q:Given an integer in base 10, convert to a given base. 
 *
 * The below answer is from base 10 to base 2
 */
public class Base10toBin {

	public String toBinRecorsive(int number){
		return toBinRecorsiveInternal(number,true);
	}

	private String toBinRecorsiveInternal(int number,boolean firstCall) {
		if(firstCall){
			if(number == 0) return "0";	
		}else{
			if(number == 0) return "";
		}
		
		int num = number/2;
		return toBinRecorsiveInternal(num,false)+(number%2);
	}
}
