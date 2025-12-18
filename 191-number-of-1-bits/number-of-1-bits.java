class Solution {
    public int hammingWeight(int n) {
        // int temp;
        // String val =" ";
        // while(n>0)
        // {
        //     temp = n%2;
        //     val+=String.valueOf(temp);
        // }
        int count=0;
        String val = Integer.toBinaryString(n);
        for(int i=0;i<val.length();i++)
        {
            char ch=val.charAt(i);
            if(ch=='1')
            {
                count++;
            }
        }
        return  count;
    }
}