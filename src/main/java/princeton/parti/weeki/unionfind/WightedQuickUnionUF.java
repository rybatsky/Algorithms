package princeton.parti.weeki.unionfind;


public class WightedQuickUnionUF
{
    private int[] id;

    private int[] size;


    public WightedQuickUnionUF(int N)
    {
        id = new int[N];
        size = new int[N];

        for (int i = 0; i < N; i++)
        {
            id[i] = i;
            size[i] = 1;
        }
    }


    private int root(int i)
    {
        while (i != id[i])
        {
            i = id[i];
        }

        return i;
    }


    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }


    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
