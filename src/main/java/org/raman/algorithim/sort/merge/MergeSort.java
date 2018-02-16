package org.raman.algorithim.sort.merge;


public class MergeSort {

	public static void main(String args[] ){
		//int[] array = {39,27,43,3,9,82,5};
		int[] array = {1,4,3,5};
		mergeSort(array, 0, array.length-1);
		System.out.print("Done:" +array );
	}
	public static void mergeSort(int[] array, int p,int r){
		if(p<r){
			int q= (int) Math.floor((r-p)/2);
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array,p,q,r);
		}
		return;
	}

	private static void merge(int[] array, int p, int q, int r) {
		if(r-p==1){
			swap(array, p, r);;
		}else{
			int length = Math.abs(p-r);
			for (int i = 0; i < length-1; i++) {
				swap(array, i, r+i);
			}
		}
	}
	
	/*
	 * Make sure that the two objects in the array are ordered
	 */
	private static void swap(int[] array,int i,int j){
		int temp;
		if(array[i]<array[j]){
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
		}
	}
}
