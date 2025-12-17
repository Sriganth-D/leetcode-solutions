class Solution {
    public int fun(int num)
    {
        if(num==0) return 0;
        if(num==1) return 1;
        return fun(num-1)+fun(num-2);
    }
    public int fib(int n) {
        return fun(n);
    }
}