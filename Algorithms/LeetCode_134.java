class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++){
            int current_Gas = 0;
            int position = i;
            while(current_Gas >= 0){
                current_Gas += gas[position];
                current_Gas -= cost[position];
                position++;
                if(position >= gas.length)
                    position = 0;
                if(position == i && current_Gas >= 0)
                    return i;
            }
        }    
    
        return -1;
    }
}
