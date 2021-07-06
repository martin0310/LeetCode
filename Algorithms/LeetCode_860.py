class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        dollar=[]
        dollar.append(0)
        dollar.append(0)
        dollar.append(0)
        for receive in bills:
            if receive == 5:
                dollar[0]+=1
            elif receive == 10:
                if dollar[0] == 0:
                    return False
                else:
                    dollar[0]-=1
                    dollar[1]+=1
            else:
                if dollar[0] < 3 and (dollar[0] == 0 or dollar[1] == 0):
                    return False
                else:
                    if dollar[0] >= 1 and dollar[1] >=1:
                        dollar[2]+=1
                        dollar[0]-=1
                        dollar[1]-=1
                    else:
                        dollar[0]-=3
        return True
