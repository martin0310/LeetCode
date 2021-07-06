class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n--);
        }
        List<String>  temp = new ArrayList<>();
        for(Integer i : list){
            temp.add(Integer.toString(i));
        }
        Collections.sort(temp);
        
       for(int i = 0; i < list.size(); i++){
           list.set(i,Integer.parseInt(temp.get(i)));
       }
        return list;
    }
}
