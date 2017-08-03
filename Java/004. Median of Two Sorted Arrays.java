public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = num1.length;
        int n = num2.length;
        double result  ;
        if((m + n) % 2 == 1)
        {
            result = findMidValue( num1, 0, m-1, num2, 0, n-1, (m + n) / 2);
        }
        else
        {
            result = findMidValue( num1, 0, m-1, num2, 0, n-1, (m + n - 1) / 2)
                    + findMidValue( num1, 0, m-1, num2, 0, n-1, (m + n + 1) / 2);
        }



        return result;
    }

    public double findMidValue(int[] num1,int mStart, int mEnd, int[] num2, int nStart, int nEnd, int k)
    {
        int i = ( mStart+mEnd) / 2;
        int j = ( nStart+nEnd) / 2;

        if()

        if(num1[i] < num2[j])
        {
            if(k =<i + j )
            {
                 findMidValue( num1, mStart, mEnd, num2, nStart, j,  k);
            }
            else
            {
                findMidValue( num1, i, mEnd,  num2,  nStart, nEnd,  k);
            }
        }
        else
        {
             if(k >=i + j )
            {
                 findMidValue( num1, mStart, mEnd,  num2,  j, nEnd,  k);
            }
            else
            {
                findMidValue( num1, mStart, i,  num2,  nStart, nEnd,  k);
            }
        }
    }
}
