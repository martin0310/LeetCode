class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        i=0
        while i != len(arr)-1:
            
            if(arr[i] == 0):
                index=i+1
                for j in range(len(arr)-1,index,-1):
                    arr[j]=arr[j-1]
                arr[index]=0
                i+=1    
            if i == len(arr)-1:
                break
            i+=1        
                    
