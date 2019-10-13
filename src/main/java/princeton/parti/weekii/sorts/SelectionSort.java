package princeton.parti.weekii.sorts;


public class SelectionSort
{
    public static void sort(Comparable[] c)
    {
        int n = c.length;
        for(int i = 0; i < n; i++)
        {
            int min = i;
            for(int j = i + 1; j < n; j++)
            {
                if (SortHelper.less(c[j], c[min]))
                {
                    min = j;
                }
                SortHelper.exch(c, i, min);
            }
        }
    }
}
