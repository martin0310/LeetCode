class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        //int index=0;
        int flag=1;
        int compare1=0,compare2=0;
        int [] arr=new int[s.length()];
        for(int i=0;i<s.length()-1;i++)
        {
                if(s.charAt(i)=='I')
                    compare1=I;
                else if(s.charAt(i)=='V')
                    compare1=V;
                else if(s.charAt(i)=='X')
                    compare1=X;
                else if(s.charAt(i)=='L')
                    compare1=L;
                else if(s.charAt(i)=='C')
                    compare1=C;
                else if(s.charAt(i)=='D')
                    compare1=D;
                else if(s.charAt(i)=='M')
                    compare1=M;
            
                if(s.charAt(i+1)=='I')
                    compare2=I;
                else if(s.charAt(i+1)=='V')
                    compare2=V;
                else if(s.charAt(i+1)=='X')
                    compare2=X;
                else if(s.charAt(i+1)=='L')
                    compare2=L;
                else if(s.charAt(i+1)=='C')
                    compare2=C;
                else if(s.charAt(i+1)=='D')
                    compare2=D;
                else if(s.charAt(i+1)=='M')
                    compare2=M;
            
            if(compare1<compare2)
            {
                arr[i]=1;
            }
            
        }
        
        for(int i=0;i<s.length()-1;i++)
        {
                if(arr[i]==1)
                    flag=0;
        }
        
        if(flag==1)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='I')
                    sum+=I;
                else if(s.charAt(i)=='V')
                    sum+=V;
                else if(s.charAt(i)=='X')
                    sum+=X;
                else if(s.charAt(i)=='L')
                    sum+=L;
                else if(s.charAt(i)=='C')
                    sum+=C;
                else if(s.charAt(i)=='D')
                    sum+=D;
                else if(s.charAt(i)=='M')
                    sum+=M;
            }
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(arr[i]==1)
                {
                    if(s.charAt(i)=='I')
                       sum-=I;
                    else if(s.charAt(i)=='V')
                       sum-=V;
                    else if(s.charAt(i)=='X')
                       sum-=X;
                    else if(s.charAt(i)=='L')
                       sum-=L;
                    else if(s.charAt(i)=='C')
                       sum-=C;
                    else if(s.charAt(i)=='D')
                       sum-=D;
                    else if(s.charAt(i)=='M')
                       sum-=M;
                    
                    if(s.charAt(i+1)=='I')
                        sum+=I;
                    else if(s.charAt(i+1)=='V')
                        sum+=V;
                    else if(s.charAt(i+1)=='X')
                        sum+=X;
                    else if(s.charAt(i+1)=='L')
                        sum+=L;
                    else if(s.charAt(i+1)=='C')
                        sum+=C;
                    else if(s.charAt(i+1)=='D')
                        sum+=D;
                    else if(s.charAt(i+1)=='M')
                        sum+=M;
                    i++;
                }
                else
                {
                    if(s.charAt(i)=='I')
                        sum+=I;
                    else if(s.charAt(i)=='V')
                        sum+=V;
                    else if(s.charAt(i)=='X')
                        sum+=X;
                    else if(s.charAt(i)=='L')
                        sum+=L;
                    else if(s.charAt(i)=='C')
                        sum+=C;
                    else if(s.charAt(i)=='D')
                        sum+=D;
                    else if(s.charAt(i)=='M')
                        sum+=M;
                } 
            }
        }
        return sum;
        
    }
}
