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
					if (list[index] != list[index+count+k]){ 
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
	
	public static int[] generateArray(int size, int max){
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int)(Math.random()*max);//note, this generates numbers from [0,max]

		    for (int j = 0; j < i; j++) {
		        if (array[i] == array[j]) {
		            i--; //if a[i] is a duplicate of a[j], then run the outer loop on i again
		            break;
		        }
		    }  
		}
        return array;
	}

	public static void main(String[] args) {
		
		
		//int[] list = new int[]{15, 12, 10, 16, 26, 5, 20, 7, 11, 24};
		int[] list = SwapOnceSort.generateArray(1000,5000);
		System.out.println("Array Size : " + list.length);
		System.out.println("Unsorted Array : " + Arrays.toString(list));
		
		//---------------Swap Once Sort --------------
		long result1;
		long startTime1 = System.currentTimeMillis();
		SwapOnceSort.SOS(list, list.length);
		long endTime1 = System.currentTimeMillis();
        result1 = endTime1-startTime1; 
        System.out.println("The Swap Once Sort runtime is " + result1 + " miliseconds");
		
		//Other Sorting Algorithms
		Sort sort = new Sort();
		
		//-------------------Selection Sort----------------
		long result2;
		long startTime2 = System.currentTimeMillis();
		sort.selectionSort(list);
        long endTime2 = System.currentTimeMillis();
        result2 = endTime2-startTime2; 
        System.out.println("The Selection Sort runtime is " + result2 + " miliseconds");
        
        //-----------------Bubble Sort--------------------
        long result3;
        long startTime3 = System.currentTimeMillis();
        sort.bubbleSort(list);
        long endTime3 = System.currentTimeMillis();
        result3 = endTime3-startTime3;
        System.out.println("The Bubble Sort runtime is "+result3 + " miliseconds");
        

        //-----------------Bubble Sort--------------------
        long result4;
        long startTime4 = System.currentTimeMillis();
        sort.insertionSort(list);
        long endTime4 = System.currentTimeMillis();
        result4 = endTime4-startTime4;
        System.out.println("The Insertion Sort runtime is "+result4 + " miliseconds");

	}

}
