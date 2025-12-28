class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> lst = new ArrayList<>();
        while(left<=right)
        {
            int digit = left;
            boolean flag = true;
            // int num=digit;
            while(digit>0)
            {
                int temp = digit%10;
                if(temp==0 ||left%temp!=0){
                    flag=false;
                    break;
                }
                digit/=10;
            }
            if(flag) lst.add(left);
            left++;
            }
        
        return lst;
    }
}