package edu.maju.shahrukh;

import java.util.Arrays;

public class SwapOnceSort {
	
	public static void SOS(int[] list, int dataSize){
		System.out.println("Initial Data : " + Arrays.toString(list));
		System.out.println("Data Size    : " + dataSize);
		
		int index=0; //function start
		while (index <= dataSize-1) { //first while loop,
			System.out.println("Index : " + index);
			int count = 0;
			int j = index + 1 ;
			System.out.println("J : " + j );
			
			while(j < dataSize){
				System.out.println("J : " + j );
				System.out.println("Index : " + index );
				System.out.println("count    : " + count);
				System.out.println("list[index] : " + list[index]);
				System.out.println("list[j]    : " + list[j]);
				
				if(list[index] > list[j]){
					System.out.println("In Loop");
					count++;
					j++;
					System.out.println("Incremented..." + "c -> " + count + "......j -> " + j);
				}
				
			}
			
			int k = 0;
			if(count > 0){
				while(k < dataSize-1){
					System.out.println("list[index] : " + list[index]);
					System.out.println("list[index+count+k]    : " + list[index+count+k]);
					if((list[index] != list[index+count+k])){
						list[index] = list[index+count+k]; 
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
	}

	public static void main(String[] args) {
		int[] list = new int[]{15, 12, 10, 16, 26, 5, 20, 7, 11, 24};
		SwapOnceSort.SOS(list, list.length);
	}

}
