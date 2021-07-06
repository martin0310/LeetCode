class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output=new ArrayList<>();
        
        if(rowIndex == 0){
            output.add(1);
            return output;
        }else if(rowIndex == 1){
            output.add(1);
            output.add(1);
            return output;
        }else{
            output.add(1);
            output.add(1);
            
            // List<Integer> prev_output=output;
            
            
            for(int i=2;i<=rowIndex;i++){
                List<Integer> new_output=new ArrayList<>();
                new_output.add(1);
                
                for(int j=1;j<output.size();j++){
                    new_output.add(output.get(j-1)+output.get(j));
                }
                new_output.add(1);
                output=new_output;
                
            }
        }
        return output;
    }
}
