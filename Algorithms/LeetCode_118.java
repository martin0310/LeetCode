class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
        for(int i=0;i<numRows;i++){
             List<Integer> input=new ArrayList<>();
            
              for(int j=0;j<i+1;j++){
                  if(j==0)
                     input.add(1);
                  else if(j==i)
                     input.add(1) ; 
                  else{
                      input.add(temp.get(j-1)+temp.get(j));
                  }
              }
              output.add(input);
              temp=input;
        }      
        
           
        return output;
    }
}
