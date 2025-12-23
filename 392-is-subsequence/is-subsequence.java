class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        boolean flag = true;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                i++;
            }
            j++;
        }
        return i==arr1.length;
    }
}