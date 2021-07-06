class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        longest=releaseTimes[0]
        output=keysPressed[0]
        for i in range(1,len(releaseTimes)) :
            if releaseTimes[i] - releaseTimes[i-1] > longest :
                longest=releaseTimes[i] - releaseTimes[i-1]
                output=keysPressed[i]
            elif releaseTimes[i] - releaseTimes[i-1] == longest :
                if keysPressed[i] > output :
                    output=keysPressed[i]
        
        return output
