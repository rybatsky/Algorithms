package princeton.parti.weekii.sorts;


public class SortHelper
{
    public static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] c, int i, int j)
    {
        Comparable temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
