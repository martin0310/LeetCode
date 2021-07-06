class Solution:
    def transpose(self, A: List[List[int]]) -> List[List[int]]:
        output=[]
        rows=len(A)
        cols=len(A[0])
        output=[[0]*rows for i in range(cols)]

        for i in range(0,len(A)):
            for j in range(0,len(A[0])):
                output[j][i]=A[i][j]
        return output        
           
