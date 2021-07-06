class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        index=0
        largest=arr[0]
        for x in arr :
            if x > largest:
                index=arr.index(x)
                largest=x
        return index        
