package edu.maju.shahrukh;

import java.util.Arrays;

public class SwapOnceSort {
	
	public static int[] SOS(int[] list, int dataSize) { //function start
		int index=0; 
		while (index <= dataSize-1) { //first while loop,
			int count = 0;
			int j = index + 1 ;
			while(j < dataSize){	
				if(list[index] > list[j]){
					count++;
				}
				j++;
			}
			int k = 0;
			if(count > 0){
				while(k < dataSize-1){
					if((list[index] != list[index+count+k])){ 
						//swapping value of two numbers with using temp variable
						int temp = list[index];
						list[index] = list[index+count+k];
						list[index+count+k] = temp;
						break;
					}
					else {
						k++;
					}
					
				}
			}
			else
				index++;
		} //End of first while loop 
		
		return list;
	}

	public static void main(String[] args) {
		int[] list = new int[]{15, 12, 10, 16, 26, 5, 20, 7, 11, 24};
		System.out.println("Unsorted Array : " + Arrays.toString(list));
		int[] sorted = SwapOnceSort.SOS(list, list.length);
		System.out.println("Sorted Array : " + Arrays.toString(sorted));
	}

}
