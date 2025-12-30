class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum1=0;
        for(int i=0;i<apple.length;i++)
        {
            sum1+=apple[i];
        }
        Arrays.sort(capacity);
        int left = capacity.length-1;
        int sum2=0;
        int count=0;
        while(left>=0)
        {
           sum2+=capacity[left];
           count++;
            if(sum1<=sum2)
            {
                return count;
            }
            // count++;
            // sum2+=capacity[left--];
            left--;
        }
        System.out.print(sum2);
        System.out.print(sum1);
        return count;
    }
}