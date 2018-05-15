package org.raman.algorithim.general;

import java.util.ArrayList;
import java.util.List;

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

	public int solution(int N) {
		String n = toBin(N);
		int max=0;
		int tmpMax=0;
		for(int i=1; i<n.length();i++){
			if(n.charAt(i)==48){
				tmpMax++;
			}else{
				if(tmpMax>max) max=tmpMax;
				tmpMax=0;
			}
		}

		return max;
	}


	public String toBin(int number){
		StringBuilder sb = new StringBuilder();
		if (number==0) return "0";
		while (number>0){
			sb.append(number%2);
			number=number/2;
		}
		return sb.reverse().toString();
	}
}
