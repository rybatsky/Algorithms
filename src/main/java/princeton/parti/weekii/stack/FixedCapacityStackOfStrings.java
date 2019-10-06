package princeton.parti.weekii.stack;


public class FixedCapacityStackOfStrings
{
    private String[] stack;
    private int N = 0;


    public FixedCapacityStackOfStrings(int capacity)
    {
        this.stack = new String[capacity];
    }


    public boolean isEmpty()
    {
        return N == 0;
    }


    public void push(String item)
    {
        stack[N++] = item;
    }


    public String pop()
    {
        final String item = stack[--N];
        stack[N] = null;
        return item;
    }
}
