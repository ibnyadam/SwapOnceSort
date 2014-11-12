# Empty File

def swap_once_sort(list, dataSize):
	index=0; 
	while (index <= dataSize-1): #first while loop,
		count = 0
		j = index + 1
		while(j < dataSize): 	
			if list[index] > list[j]: 
				count+=1
			
			j+=1
		
		k = 0
		if count > 0:
			while k < dataSize-1:
				if list[index] is not list[index+count+k]:  
					#swapping value of two numbers with using temp variable
					temp = list[index]
					list[index] = list[index+count+k]
					list[index+count+k] = temp
					break
				
				else:
					k+=1
		else :
			index+=1
	return list;
	
	
	
list = {15, 12, 10, 16, 26, 5, 20, 7, 11, 24}	
swap_once_sort(list, len(list))