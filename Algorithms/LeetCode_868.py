class Solution:
    def binaryGap(self, n: int) -> int:
        str(n)
        binnum = [int(i) for i in list('{0:0b}'.format(n))]
        
        distance = 0
        first_one = 0
        second_one = 0
        
        for i in range(0,len(binnum)) :
            if binnum[i] == 1 :
                first_one = i
                second_one = i+1
                break;
        for i in range(second_one,len(binnum)) :
            temp = 0
            if binnum[i] == 1 :
                temp = i - first_one
                if temp >= distance :
                    distance = temp
                first_one = i
                if i != len(binnum) - 1 :
                    second_one = i + 1
        return distance        
        

        
        
