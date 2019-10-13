package princeton.parti.weekii.sorts;


public class InsertionSort
{
    public static void sort(Comparable[] c)
    {
        int n = c.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i - 1; j > 0; j--)
            {
                if (SortHelper.less(c[j], c[j - 1]))
                {
                    SortHelper.exch(c, j, j - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
