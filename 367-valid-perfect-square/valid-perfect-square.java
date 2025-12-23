class Solution {
    public boolean isPerfectSquare(int num) {
        // int i=1;
        // int square;
        // while(i<=num)
        // {
        //     square =(int)Math.pow(i,2);
        //     if(num == square) return true;
        //     i++;
        // }
        // return false;
        int n = (int) Math.sqrt(num);
        if(n*n == num) return true;
        return false;
    }
}