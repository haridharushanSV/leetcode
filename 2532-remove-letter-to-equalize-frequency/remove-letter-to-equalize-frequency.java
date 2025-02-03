class Solution {
    public boolean equalFrequency(String word) {
        int n=word.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
        {
            int a=(int)word.charAt(i)-'a';
            arr[a]++;
        }
        Arrays.sort(arr);
        Set<Integer> ans=new HashSet<>();
        for(int i:arr)
        {
            if(i!=0)
            {
                ans.add(i);
            }
        }
        if(ans.size()>2)
        {
            return false;
        }
        if(ans.size()==1)
        {
            if(arr[25]>1 && arr[24]!=0)
            {
                return false;
            }
            else{
                return true;
            }
        }
        int posi=0;
        for(int i=0;i<26;i++)
        {
            int a=arr[i];
            if(a>0)
            {
                posi=i;
                break;
            }
        }
        if((arr[posi]==1 && arr[posi+1]==arr[25])||(arr[25] - 1 == arr[24] && arr[24] == arr[posi]))
        {
            return true;
        } 
        return false;
    }
}