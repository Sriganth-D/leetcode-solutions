// class Solution {
//     public int hammingDistance(int x, int y) {
        // StringBuilder val1= new StringBuilder();
        // StringBuilder val2= new StringBuilder();
        // while(x>0)
        // {
        //     val1.append(x%2);
        //     x/=2;
        // }
        // while(y>0)
        // {
        //     val2.append(y%2);
        //     y/=2;
        // }
        // String res1= val1.toString();
        // String res2= val2.toString();
        // int count = 0;
        // for(int i=0;i<res1.length();i++)
        // {
        //     count=res1.charAt(i)^res2.charAt(i);
        // }
        // return count;
        // int count=0;
        // String val1= Integer.toBinaryString(x);
        // String val2= Integer.toBinaryString(y);
        // for(int i=0;i<val1.length();i++)
        // {
        //     count =  val1.charAt(i)^val2.charAt(i);
        // }
        // return count;
        class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;

        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}

 